package com.springboot.day9;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * java类作用
 * @author: huangh
 */
@Configuration
public class ImageConfiguration extends WebMvcConfigurerAdapter {

    /**
     * 自定义静态资源文件路径
     * @param
     * @return
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /* 自定义静态资源文件路径 */
        registry.addResourceHandler("/image/day9/resources/**").addResourceLocations("classpath:/static/");
    }
}
