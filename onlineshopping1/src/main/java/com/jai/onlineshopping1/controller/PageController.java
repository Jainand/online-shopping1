package com.jai.onlineshopping1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Home");
		modelAndView.addObject("userClickHome", true);
		return modelAndView;
	}
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "About Us");
		modelAndView.addObject("userClickAbout", true);
		return modelAndView;
	}
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Contact Us");
		modelAndView.addObject("userClickContact", true);
		return modelAndView;
	}
	
	
	
	
	
	
	
	

	/*@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) {
		if (greeting == null) {
			greeting = "Hello There";
		}
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("greeting", greeting);
		return modelAndView;
	}*/
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		if (greeting == null) {
			greeting = "Hello There";
		}
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("greeting", greeting);
		return modelAndView;
	}
}
