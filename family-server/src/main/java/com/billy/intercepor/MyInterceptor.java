package com.billy.intercepor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  自定义拦截器
 *      实现 org.springframework.web.servlet.HandlerInterceptor接口
 *      或继承 org.springframework.web.servlet.handler.HandlerInterceptorAdapter类
 *
 *      拦截器(Interceptor)同 Filter 过滤器一样，它俩都是面向切面编程——AOP 的具体实现。
 *      作用：
 *          如在 Controller 处理请求之前编写日志，添加或更新配置.
 *      区别：
 *          过滤器（Filter）：当你有一堆东西的时候，你只希望选择符合你要求的某一些东西。定义这些要求的工具，就是过滤器。
 *          拦截器（Interceptor）：在一个流程正在进行的时候，你希望干预它的进展，甚至终止它进行，这是拦截器做的事情。
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("interceptor pre handle ....");

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("interceptor post handle ...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {


        long endTime = System.currentTimeMillis();
        long startTime = (long) request.getAttribute("startTime");

        System.out.println("Request Url " + request.getRequestURL());
        System.out.println("Time taken " +(endTime - startTime));

        System.out.println("interceptor after handle ...");

    }
}
