package com.springboot.day25.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试跨域请求控制器
 * @author: huangh
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/cors")
    public String corsIndex(){
        return "this is cors info";
    }

}
