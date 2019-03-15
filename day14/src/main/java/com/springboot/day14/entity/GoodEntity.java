package com.springboot.day14.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 商品信息表
 * @author: huangh
 */
@Entity
@Table(name = "good_infos")
public class GoodEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "tg_id")
    private Long id;

    @Column(name = "tg_title")
    private String title;

    @Column(name = "tg_price")
    private double price;

    @Column(name = "tg_unit")
    private String unit;

    @Column(name = "tg_order")
    private int order;

    @OneToOne
    @JoinColumn(name = "tg_type_id")
    private GoodTypeEntity type;

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
     * Gets the value of price.
     *
     * @return the value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * <p>You can use getPrice() to get the value of price</p>
     *
     * @param price price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the value of unit.
     *
     * @return the value of unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the unit.
     *
     * <p>You can use getUnit() to get the value of unit</p>
     *
     * @param unit unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
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

    /**
     * Gets the value of type.
     *
     * @return the value of type
     */
    public GoodTypeEntity getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * <p>You can use getType() to get the value of type</p>
     *
     * @param type type
     */
    public void setType(GoodTypeEntity type) {
        this.type = type;
    }

}
