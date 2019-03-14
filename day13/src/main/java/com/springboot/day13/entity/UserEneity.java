package com.springboot.day13.entity;

import com.springboot.day13.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user")
public class UserEneity extends BaseEntity implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long id;
    
    @Column(name = "t_name")
    private String name;
    
    @Column(name = "t_age")
    private int age;
    
    @Column(name = "t_address")
    private String address;
    
    @Column(name = "t_pwd")
    private String pwd;
    
    @Transient
    private String sort;
    
    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public Long getId() {
        return id;
    }
    
    /**
     * Sets the id.
     *
     * <p>You can use getId() to get the value of id</p>
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }
    
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
     * Gets the value of address.
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Sets the address.
     *
     * <p>You can use getAddress() to get the value of address</p>
     *
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
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
    
    /**
     * Gets the value of sort.
     *
     * @return the value of sort
     */
    public String getSort() {
        return sort;
    }
    
    /**
     * Sets the sort.
     *
     * <p>You can use getSort() to get the value of sort</p>
     *
     * @param sort sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }
    
}
