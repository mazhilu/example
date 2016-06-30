package com.asto.service.test.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asto.domain.domain.Account;
import com.asto.persist.test.AccountDao;
import com.asto.service.test.AccountService;

@Component("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired 
	private AccountDao accountDao;
	
	@Override
	public List<Account> queryByAll() {
		return accountDao.queryByAll();
	}

}
