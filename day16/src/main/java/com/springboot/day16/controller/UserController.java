package com.springboot.day16.controller;

import com.springboot.day16.entity.UserEneity;
import com.springboot.day16.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层
 * @author: huangh
 */
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserEneity> list(){
        return userService.list();
    }

}
