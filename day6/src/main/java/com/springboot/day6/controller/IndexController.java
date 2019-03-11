package com.springboot.day6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* @description: 首页控制器
* @author:      huangh
* @createDate:  2019/3/11 14:45
*/
@Controller
@RequestMapping(value = "/user")
public class IndexController {

    /**
    * 初始化登录页面
    * @param
    * @return
    * @author huangh
    */
    @RequestMapping(value = "/login_view", method = RequestMethod.GET)
    public String login_view(){
        return "login";
    }

    /**
    * 首页
    * @param
    * @return
    * @author huangh
    */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
