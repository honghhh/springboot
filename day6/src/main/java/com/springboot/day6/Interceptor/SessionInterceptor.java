package com.springboot.day6.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* @description: 登录拦截器
* @author:      huangh
* @createDate:  2019/3/11 15:15
*/
public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception{
        // 登录放行
        if (request.getRequestURI().equals("/user/login") || request.getRequestURI().equals("/user/login_view")) {
            return true;
        }
        // 验证session是否存在
        Object object = request.getSession().getAttribute("_session_user");
        if (object == null) {
            // 如果session不存在则去登录页面
            response.sendRedirect("/user/login_view");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView view) throws Exception{

    };

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception ex) throws Exception{

    };

}
