package com.springboot.day20.controller;

import com.springboot.day20.entity.WiselyMessage;
import com.springboot.day20.entity.WiselyReponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * WebSocket控制器
 * @author: huangh
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyReponse say(WiselyMessage message) throws Exception {
        // 等待3秒返回消息内容
        Thread.sleep(3000);
        return new WiselyReponse("欢迎使用WebSocket:" + message.getName());
    }

}
