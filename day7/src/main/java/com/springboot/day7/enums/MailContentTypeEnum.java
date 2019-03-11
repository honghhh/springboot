package com.springboot.day7.enums;

/**
* @description: 邮件枚举
* @author:      huangh
* @createDate:  2019/3/11 16:59
*/
public enum MailContentTypeEnum {

    HTML("text/htmlcharset;=UTF-8"), // html格式
    TEXT("text");

    private String value;

    MailContentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
