package com.springboot.day8.controller;

import com.alibaba.fastjson.JSONObject;
import com.springboot.day8.util.LoggerUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
* 测试控制器
* @author: huangh
*/
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    /**
     * 简单测试请求日志的记录
     * @param name 用户名
     * @return
     */
    @RequestMapping(value = "/login")
    public JSONObject login(HttpServletRequest request, String name) throws Exception {
        JSONObject obj = new JSONObject();
        obj.put("msg", "用户：" + name + "，登录成功");
        // 将返回值写入请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN, obj);
        return obj;
    }


}
