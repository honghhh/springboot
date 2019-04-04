package com.springboot.day17.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页控制器
 * @author: huangh
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "get index success";
    }

}
