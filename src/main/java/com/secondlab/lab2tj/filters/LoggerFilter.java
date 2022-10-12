package com.secondlab.lab2tj.filters;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter(
        dispatcherTypes = {DispatcherType.REQUEST},
        urlPatterns = {"/LoggerFilter", "/WordServlet"}
)
public class LoggerFilter extends HttpFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String letters = request.getParameter("letters");
        int size = Integer.parseInt(request.getParameter("size"));
        
        System.out.print("Letters: " + letters + "\n");
        System.out.print("Size: " + size + "\n");

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        System.out.print("logger filter initiliazed\n");
    }
}
