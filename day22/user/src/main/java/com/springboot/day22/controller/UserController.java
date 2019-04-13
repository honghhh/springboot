package com.springboot.day22.controller;

import com.springboot.day22.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户控制器
 * @author: huangh
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/index")
    public String index(HttpServletRequest request, UserBean user) {
        // 将name属性传入到user_index.jsp页面中展示
        request.setAttribute("name", user.getName());
        // 跳转到user_index.jsp页面
        return "user_index";
    }

}
