package com.springboot.day16.service;

import com.springboot.day16.entity.UserEneity;
import com.springboot.day16.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

/**
 * 用户业务层
 * <p> @CacheConfig：该注解是用来开启声明的类参与缓存,如果方法内的@Cacheable注解没有添加key值，那么会自动使用cahceNames配置参数并且追加方法名。</p>
 * <p> @Cacheable：配置方法的缓存参数，可自定义缓存的key以及value。</p>
 * @author: huangh
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService {

    @Autowired
    private UserJPA userJPA;

    /* Spring Cache是作用在方法上的，其核心思想是：当我们在调用一个缓存方法时会把该方法参数和返回结果作为一个键值对存放在缓存中，
       等到下次利用同样的参数来调用该方法时将不再执行该方法，而是直接从缓存中获取结果进行返回。@CacheConfig在类上面统一定义缓存的
       名字，方法上面就不用标注了，当标记在一个类上时则表示该类所有的方法都是支持缓存的 */
    @Cacheable
    public List<UserEneity> list() {
        return userJPA.findAll();
    }

}
