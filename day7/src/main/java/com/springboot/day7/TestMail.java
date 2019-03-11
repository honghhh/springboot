package com.springboot.day7;

import com.springboot.day7.core.MailSender;
import com.springboot.day7.enums.MailContentTypeEnum;

import java.util.ArrayList;

/**
* @description: main方法
* @author:      huangh
* @createDate:  2019/3/11 17:16
*/
public class TestMail {
    public static void main(String[] args) throws Exception {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("2821132805@qq.com");
                }})
                .send();
    }
}
