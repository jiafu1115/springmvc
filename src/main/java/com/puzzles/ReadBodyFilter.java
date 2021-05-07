package com.puzzles;


import org.apache.commons.io.IOUtils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class ReadBodyFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
       // String requestBody = IOUtils.toString(request.getInputStream(), "utf-8");
        //System.out.println("print request body in filter:" + requestBody);
        chain.doFilter(request, response);
    }

}