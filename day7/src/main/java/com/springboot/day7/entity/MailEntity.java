package com.springboot.day7.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
* @description: 发送邮件实体类
* @author:      huangh
* @createDate:  2019/3/11 16:48
*/
public class MailEntity implements Serializable {

    //此处填写SMTP服务器
    private String smtpService;

    //设置端口号
    private String smtpPort;

    //设置发送邮箱
    private String fromMailAddress;

    // 设置发送邮箱的STMP口令
    private String fromMailStmpPwd;

    //设置邮件标题
    private String title;

    //设置邮件内容
    private String content;

    //内容格式（默认采用html）
    private String contentType;

    //接受邮件地址集合
    private List<String> list = new ArrayList<>();

    /**
     * Gets the value of smtpService.
     *
     * @return the value of smtpService
     */
    public String getSmtpService() {
        return smtpService;
    }

    /**
     * Sets the smtpService.
     *
     * <p>You can use getSmtpService() to get the value of smtpService</p>
     *
     * @param smtpService smtpService
     */
    public void setSmtpService(String smtpService) {
        this.smtpService = smtpService;
    }

    /**
     * Gets the value of smtpPort.
     *
     * @return the value of smtpPort
     */
    public String getSmtpPort() {
        return smtpPort;
    }

    /**
     * Sets the smtpPort.
     *
     * <p>You can use getSmtpPort() to get the value of smtpPort</p>
     *
     * @param smtpPort smtpPort
     */
    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    /**
     * Gets the value of fromMailAddress.
     *
     * @return the value of fromMailAddress
     */
    public String getFromMailAddress() {
        return fromMailAddress;
    }

    /**
     * Sets the fromMailAddress.
     *
     * <p>You can use getFromMailAddress() to get the value of fromMailAddress</p>
     *
     * @param fromMailAddress fromMailAddress
     */
    public void setFromMailAddress(String fromMailAddress) {
        this.fromMailAddress = fromMailAddress;
    }

    /**
     * Gets the value of fromMailStmpPwd.
     *
     * @return the value of fromMailStmpPwd
     */
    public String getFromMailStmpPwd() {
        return fromMailStmpPwd;
    }

    /**
     * Sets the fromMailStmpPwd.
     *
     * <p>You can use getFromMailStmpPwd() to get the value of fromMailStmpPwd</p>
     *
     * @param fromMailStmpPwd fromMailStmpPwd
     */
    public void setFromMailStmpPwd(String fromMailStmpPwd) {
        this.fromMailStmpPwd = fromMailStmpPwd;
    }

    /**
     * Gets the value of title.
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * <p>You can use getTitle() to get the value of title</p>
     *
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the value of content.
     *
     * @return the value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     *
     * <p>You can use getContent() to get the value of content</p>
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the value of contentType.
     *
     * @return the value of contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the contentType.
     *
     * <p>You can use getContentType() to get the value of contentType</p>
     *
     * @param contentType contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Gets the value of list.
     *
     * @return the value of list
     */
    public List<String> getList() {
        return list;
    }

    /**
     * Sets the list.
     *
     * <p>You can use getList() to get the value of list</p>
     *
     * @param list list
     */
    public void setList(List<String> list) {
        this.list = list;
    }
}
