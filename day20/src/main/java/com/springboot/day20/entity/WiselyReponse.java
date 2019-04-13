package com.springboot.day20.entity;

/**
 * 服务端向浏览器发送消息实体
 * @author: huangh
 */
public class WiselyReponse {

    private String responseMessage;

    public WiselyReponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
     * Gets the value of responseMessage.
     *
     * @return the value of responseMessage
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the responseMessage.
     *
     * <p>You can use getResponseMessage() to get the value of responseMessage</p>
     *
     * @param responseMessage responseMessage
     */
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
