package com.springboot.day14.controller;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.springboot.day14.Inquirer;
import com.springboot.day14.entity.GoodEntity;
import com.springboot.day14.entity.QGoodEntity;
import com.springboot.day14.jpa.GoodJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 查询控制器
 * @author: huangh
 */
@RestController
@RequestMapping
public class QueryController {

    @Autowired
    private GoodJPA goodJPA;

    // 注入EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * 单独用querydsl查询实体
     * @return
     */
    @RequestMapping(value = "/query")
    public List<GoodEntity> list() {
        // querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;
        JPAQuery<GoodEntity> jpaQuery = new JPAQuery<>(entityManager);
        // 返回查询接口
        return jpaQuery
                //查询字段
                .select(_good)
                // 查询表
                .from(_good)
                // 查询条件
                .where(_good.type.id.eq(Long.valueOf("1")))
                // 返回结果
                .fetch();
    }

    /**
     * SpringDataJPA整合QueryDSL查询
     * @return
     */
    @RequestMapping(value = "/join")
    public List<GoodEntity> join() {
        // querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;
        // 查询条件
        BooleanExpression expression = _good.type.id.eq(Long.valueOf("1"));
        // 执行查询
        Iterator<GoodEntity> iterable = goodJPA.findAll(expression).iterator();
        List<GoodEntity> goods = new ArrayList<>();
        // 转成list
        while (iterable.hasNext()) {
            goods.add(iterable.next());
        }
        return goods;
    }

    /**
     * spring data jpa 整合querydsl完成查询(封装后)
     * @return
     */
    /*@RequestMapping(value = "/join")
    public List<GoodEntity> join()
    {
        //querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;
        //自定义查询对象
        Inquirer inquirer = new Inquirer();
        //添加查询条件
        inquirer.putExpression(_good.type.id.eq(Long.valueOf("1")));
        //返回查询结果
        return inquirer.iteratorToList(goodJPA.findAll(inquirer.buidleQuery()));
    }*/

}
