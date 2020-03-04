package com.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {



    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri=request.getRequestURI();
        //判断当前请求地址是否是登陆/注册地址
        if (!(uri.contains("login")||uri.contains("Login")||uri.contains("register"))){
            //非登陆请求
            if (request.getSession().getAttribute("user")!=null){
                return true; //已登录
            }
            else {
                if(uri.contains("css")||uri.contains("js")||uri.contains("img")){
                    return true;//资源文件 放行
                }
                else {
                    //没有登陆 进入登陆页面
                    response.sendRedirect(request.getContextPath()+"/user/toLogin.action");
                }
            }
        }
        else {
            //登陆请求 放行
            return true;
        }
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
