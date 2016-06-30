package com.asto.trade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class tradeController {
	
	@RequestMapping
	public ModelAndView getAll(){
		
		
		return new ModelAndView();
	}
}
