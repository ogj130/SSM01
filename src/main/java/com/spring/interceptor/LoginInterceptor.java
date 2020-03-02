package com.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(javax.servlet.http.HttpServletRequest request,
                             javax.servlet.http.HttpServletResponse response,
                             Object handler) throws Exception {
        return true;
    }

    public void postHandle(javax.servlet.http.HttpServletRequest request,
                           javax.servlet.http.HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
