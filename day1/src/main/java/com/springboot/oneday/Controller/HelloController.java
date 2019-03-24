package com.springboot.oneday.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 * @author: huangh
 */
@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/index")
    public String test(){
        return "Hello";
    }

}
