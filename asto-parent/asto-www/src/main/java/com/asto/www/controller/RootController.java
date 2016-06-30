package com.asto.www.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asto.domain.domain.Account;
import com.asto.service.test.AccountService;

@Controller
public class RootController {
	@Resource
	private AccountService accountService;
	
   @RequestMapping
   	public ModelAndView show(Map<String,Object> out){
	   List<Account> account = accountService.queryByAll();
	   out.put("list", account);
	   return null;
   }
}
