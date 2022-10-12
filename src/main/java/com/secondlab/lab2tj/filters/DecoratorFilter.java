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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

@WebFilter(
        dispatcherTypes = {DispatcherType.REQUEST},
        urlPatterns = {"/DecoratorFilter", "/WordServlet"}
)
public class DecoratorFilter extends HttpFilter implements Filter {

    static class FilteredRequest extends HttpServletRequestWrapper {

        public FilteredRequest(ServletRequest request) {
            super((HttpServletRequest) request);
        }

        @Override
        public String getParameter(String paramName) {
            String value = super.getParameter(paramName);

            if (paramName.equals("letters")) {
                return "UpperCase of value: " + value + " is " + value.toUpperCase();
            } else {
                return value;
            }
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(new FilteredRequest(request), response);
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        System.out.print("Decorator filter initialized\n");
    }
}
