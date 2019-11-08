package com.billy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 自定义过滤器
 *   为了能让 Spring 找到它，你需要在启动类上加上 @ServletComponentScan 注解。
 *   作用：
 *      对用户请求进行前置处理和后置处理，
 * 	    实现URL级别的权限控制、过滤非法请求等
 */
@WebFilter(filterName = "MyFilter", urlPatterns = "/family_server/*")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("filter init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("filter doFilter...");

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

        System.out.println("filter destroy....");
    }
}
