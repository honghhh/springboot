package com.springboot.day14.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 商品分类信息表
 * @author: huangh
 */
@Entity
@Table(name = "good_types")
public class GoodTypeEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "tgt_id")
    private Long id;

    @Column(name = "tgt_name")
    private String name;

    @Column(name = "tgt_is_show")
    private int isShow;

    @Column(name = "tgt_order")
    private int order;

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
     * Gets the value of isShow.
     *
     * @return the value of isShow
     */
    public int getIsShow() {
        return isShow;
    }

    /**
     * Sets the isShow.
     *
     * <p>You can use getIsShow() to get the value of isShow</p>
     *
     * @param isShow isShow
     */
    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    /**
     * Gets the value of order.
     *
     * @return the value of order
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the order.
     *
     * <p>You can use getOrder() to get the value of order</p>
     *
     * @param order order
     */
    public void setOrder(int order) {
        this.order = order;
    }

}
