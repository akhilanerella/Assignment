package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyInterceptorHandler implements HandlerInterceptor{
	   
	   @Override
	   public boolean preHandle
	      (HttpServletRequest request, HttpServletResponse response, Object handler) 
	      throws Exception {
	   //just for reference that the implementation works for all the API calls   
	      System.out.println("Pre Handle method is Calling");
	      return true;
	   }
	   @Override
	   public void postHandle(HttpServletRequest request, HttpServletResponse response, 
	      Object handler, ModelAndView modelAndView) throws Exception {
	      
	      System.out.println("Post Handle method is Calling");
	   }
	   @Override
	   public void afterCompletion
	      (HttpServletRequest request, HttpServletResponse response, Object 
	      handler, Exception exception) throws Exception {
	      
	      System.out.println("Request and Response is completed");
	   }
	
}
