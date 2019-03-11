package com.springboot.day6;

import com.springboot.day6.Interceptor.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
* @description: Session配置类
* @author:      huangh
* @createDate:  2019/3/11 16:05
*/
@Configuration
public class SessionConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
    }

}
