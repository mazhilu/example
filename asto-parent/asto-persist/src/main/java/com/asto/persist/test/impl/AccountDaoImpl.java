package com.asto.persist.test.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.asto.domain.domain.Account;
import com.asto.persist.BaseDaoSupport;
import com.asto.persist.test.AccountDao;

@Component("accountDao")
public class AccountDaoImpl extends BaseDaoSupport implements AccountDao {
	final static String SQL_PREFIX = "account";
	@SuppressWarnings("unchecked")
	@Override
	public List<Account> queryByAll() {
		return getSqlMapClientTemplate().queryForList(addSqlKeyPreFix(SQL_PREFIX, "queryByAll"));
	}
}
