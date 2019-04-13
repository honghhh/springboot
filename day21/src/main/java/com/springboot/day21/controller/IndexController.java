package com.springboot.day21.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author: huangh
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index/{number}")
    public String index(@PathVariable int number){
        System.out.println(20 / number);
        return "get index page successfully.";
    }
}
