package com.yash.Millennium.configuration.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;



@Controller("error")
public class ErrorController {

	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handlerException(HttpServletRequest request, Exception ex) {
		ModelAndView mv= new ModelAndView();
		
		mv.addObject("exception", ex.getLocalizedMessage());
		mv.addObject("url", request.getRequestURI());
		mv.setViewName("error");
		return mv;
	}
}
