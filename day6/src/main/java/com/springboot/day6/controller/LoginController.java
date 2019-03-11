package com.springboot.day6.controller;

import com.springboot.day6.entity.UserEneity;
import com.springboot.day6.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

/**
* @description: 登录控制器
* @author:      huangh
* @createDate:  2019/3/11 14:45
*/
@RestController
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/login")
    public String login(UserEneity user, HttpServletRequest request){
        // 登录成功
        boolean flag = true;
        String result = "登录成功";
        // 根据用户名查询用户是否存在
        UserEneity userEneity = userJPA.findOne(new Specification<UserEneity>() {
            @Override
            public Predicate toPredicate(Root<UserEneity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"),user.getName()));
                return null;
            }
        });
        if (userEneity == null) {
            flag = false;
            return "用户不存在，登录失败";
        }else if (!userEneity.getPwd().equals(user.getPwd())) {
            flag = false;
            return "密码错误，登录失败";
        }
        if (flag) {
            // 将用户写入session
            request.getSession().setAttribute("_session_user", userEneity);
        }
        return result;
    }

}
