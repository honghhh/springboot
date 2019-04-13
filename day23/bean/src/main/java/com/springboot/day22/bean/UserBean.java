package com.springboot.day22.bean;

import java.io.Serializable;

/**
 * UserBean
 * @author: huangh
 */
public class UserBean implements Serializable {

    // 用户名
    private String name;
    // 密码
    private String pwd;

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * <p>You can use getName() to get the value of name</p>
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of pwd.
     *
     * @return the value of pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the pwd.
     *
     * <p>You can use getPwd() to get the value of pwd</p>
     *
     * @param pwd pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
