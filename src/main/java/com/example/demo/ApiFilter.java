package com.example.demo;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class ApiFilter extends GenericFilterBean {

	    @Override
	    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

	        var request = (HttpServletRequest) servletRequest;
	        var response = (HttpServletResponse) servletResponse;

	        //if header is missing , send un-athorized error back
	        String authHeader = request.getHeader("X-Header-Version");
	        if (StringUtils.isEmpty(authHeader)) {
	            response.setStatus(
	                HttpServletResponse.SC_UNAUTHORIZED);
	        } else {
	            filterChain.doFilter(servletRequest, servletResponse);
	        }
	    }
	}
