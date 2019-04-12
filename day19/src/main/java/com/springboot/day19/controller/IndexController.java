package com.springboot.day19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页控制器
 * @author: huangh
 */
@RestController
@RequestMapping("/api")
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(){
        return "success";
    }

}
