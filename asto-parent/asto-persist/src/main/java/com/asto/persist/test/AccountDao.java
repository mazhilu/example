package com.asto.persist.test;

import java.util.List;

import com.asto.domain.domain.Account;

public interface AccountDao {
	public List<Account> queryByAll();
}
