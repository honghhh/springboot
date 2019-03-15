package com.springboot.day14.jpa;

import com.springboot.day14.entity.GoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * 商品信息操作类
 * <p>使用QueryDSL需继承QueryDslPredicateExecutor
 * 该接口是SpringDataJPA提供的querydsl查询接口</p>
 * @author: huangh
 */
public interface GoodJPA extends JpaRepository<GoodEntity, Long>, QueryDslPredicateExecutor<GoodEntity> {

}
