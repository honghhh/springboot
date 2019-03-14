package com.springboot.day10.Servlet;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Servlet配置类
 * @author: huangh
 */
@Configuration
@ServletComponentScan
public class ServletConfiguration {

    /**
     * 装载Servlet
     * <p>方法1：手动配置</p>
     * <p>方法2：注解配置</p>
     * @return
     */
    /*@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new TestServlet(), "/test");
    }*/

}
