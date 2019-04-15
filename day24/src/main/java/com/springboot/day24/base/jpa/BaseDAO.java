package com.springboot.day24.base.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * 该接口继承自JpaRepository<T,long>，如需自定义CRUD函数，可自己在继承该接口的子接口内实现
 * @author: huangh
 */
public interface BaseDAO<T> extends JpaRepository<T,Long>, JpaSpecificationExecutor<T>, Serializable {

}
