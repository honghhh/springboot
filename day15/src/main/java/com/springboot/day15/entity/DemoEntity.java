package com.springboot.day15.entity;

import com.springboot.day15.validator.FlagValidator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * 验证测试类
 * <p>参数说明在resouces/static/目录下</p>
 * @author: huangh
 */
public class DemoEntity implements Serializable {

    @NotBlank
    @Length(min = 2, max = 10)
    private String name;

    @Min(value = 1)
    private int age;

    @NotBlank
    @Email
    private String mail;

    @FlagValidator(values = "1,2,3")
    private String flag;

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
     * Gets the value of age.
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age.
     *
     * <p>You can use getAge() to get the value of age</p>
     *
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the value of mail.
     *
     * @return the value of mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the mail.
     *
     * <p>You can use getMail() to get the value of mail</p>
     *
     * @param mail mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Gets the value of flag.
     *
     * @return the value of flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the flag.
     *
     * <p>You can use getFlag() to get the value of flag</p>
     *
     * @param flag flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

}
