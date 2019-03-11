package com.springboot.day6.controller;

import com.springboot.day6.entity.UserEneity;
import com.springboot.day6.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @description: 用户控制器
* @author:      huangh
* @createDate:  2019/3/9 13:38
*/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
    * 查询用户列表
    * @return
    * @author huangh
    */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserEneity> list(){
        return userJPA.findAll();
    }

    /**
    * 保存用户对象
    * @param  userEneity 用户对象
    * @return
    * @author huangh
    */
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public UserEneity save(UserEneity userEneity){
        return userJPA.save(userEneity);
    }

    /**
    * 删除用户对象
    * @param  id 用户对象
    * @return
    * @author huangh
    */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public List<UserEneity> delete(Long id){
        userJPA.delete(id);
        return userJPA.findAll();
    }

}
