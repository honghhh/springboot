package com.springboot.day13.base;

import java.io.Serializable;

/**
 * 自定义BaseEntity
 * @author: huangh
 */
public class BaseEntity implements Serializable {
    
    /**
     * 分页页码，默认为1
     */
    protected int page = 1;
    
    /**
     * 分页每页数量，默认每页20条
     */
    protected int size = 20;
    
    /**
     * 排序列名称，默认为id
     */
    protected String sidx = "id";
    
    /**
     * Gets the value of page.
     *
     * @return the value of page
     */
    public int getPage() {
        return page;
    }
    
    /**
     * Sets the page.
     *
     * <p>You can use getPage() to get the value of page</p>
     *
     * @param page page
     */
    public void setPage(int page) {
        this.page = page;
    }
    
    /**
     * Gets the value of size.
     *
     * @return the value of size
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Sets the size.
     *
     * <p>You can use getSize() to get the value of size</p>
     *
     * @param size size
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Gets the value of sidx.
     *
     * @return the value of sidx
     */
    public String getSidx() {
        return sidx;
    }
    
    /**
     * Sets the sidx.
     *
     * <p>You can use getSidx() to get the value of sidx</p>
     *
     * @param sidx sidx
     */
    public void setSidx(String sidx) {
        this.sidx = sidx;
    }
    
}
