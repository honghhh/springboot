package com.springboot.day24.user.controller;

import com.springboot.day24.user.bean.UserBean;
import com.springboot.day24.user.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserBean> list(){
        return userJPA.findAll();
    }

}
