package com.springboot.day18;

/**
 * 用户异常
 * @author: huangh
 */
public class NewUserNotFoundException
        extends RuntimeException

{

    public NewUserNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }

    public NewUserNotFoundException(String msg) {
        super(msg);
    }
}
