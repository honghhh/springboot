package com.springboot.day16.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.lang.reflect.Method;

/**
 * redis配置类
 * <p> 1.进入到Redis解压目录并且执行redis-server.exe redis.windows.conf命令开启redis </p>
 * <p> 2.配置redis连接application.yml </p>
 * <p> 3.@EnableCaching 开启项目缓存支持 </p>
 * @author: huangh
 */
@Configuration
@EnableCaching
public class RedisConfiguration extends CachingConfigurerSupport  {

    /**
     * 自定义生成key的规则
     * @return
     */
    @Override
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                // 格式化缓存key字符串
                StringBuffer sb = new StringBuffer();
                // 追加类名
                sb.append(o.getClass().getName());
                // 追加方法名
                sb.append(method.getName());
                // 遍历参数并且追加
                for (Object obj : objects) {
                  sb.append(obj.toString());
                  System.out.println(obj.toString());
                }
                System.out.println("调用Redis缓存key：" + sb.toString());
                return sb.toString();
            }
        };
    }
    /**
     * 采用RedisCacheManager作为缓存管理器
     * @param redisTemplate
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate) {
        /* 我们使用@EnableCaching注解来开启我们的项目支持缓存，我们在配置类内添加了方法cacheManager()，
           方法的返回值则是使用了我们的Redis缓存的管理器，SpringBoot项目启动时就会去找自定义配置的CacheManager
           对象并且自动应用到项目中。*/
        return new RedisCacheManager(redisTemplate);
    }

    /**
     * redis key和values乱码处理
     * @return
     */
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
        StringRedisTemplate template = new StringRedisTemplate(factory);
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }

}
