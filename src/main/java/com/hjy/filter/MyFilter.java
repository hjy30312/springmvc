package com.hjy.filter;


import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    //启动Tomcat服务器时，加载web.xml里Filter配置
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain) throws IOException, ServletException {
        //前期逻辑
        servletRequest.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
        //后期逻辑
    }

    public void destroy() {

    }
}
