package com.springweb.controller;
//testjkll
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/hello", name="/hello")
	public ModelAndView sayHello(){
		ModelAndView model = new ModelAndView("HelloWorld");
		model.addObject("message", "Hello welcome to SpringMVC");
		return model;
	}
}
