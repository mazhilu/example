package com.asto.trade.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asto.domain.domain.Account;
import com.asto.domain.test.Test;
import com.asto.service.test.AccountService;
import com.asto.service.test.TestService;

@Controller
public class jdkController {
	@Resource
	private AccountService accountService;
	@Resource
	private TestService testService;
	@RequestMapping
	public ModelAndView getAll(Map<String,Object> out){
//		List<Account> list = accountService.queryByAll();
//		out.put("list", list);
		List<Test> test = testService.queryAll();
		out.put("list", test);
		return null;
	}
}
