package com.asto.persist.test.impl;

import java.util.List;


import org.springframework.stereotype.Component;

import com.asto.persist.BaseDaoSupport;
import com.asto.persist.test.TestDao;

@Component("testDao")
public class TestDaoImpl extends BaseDaoSupport implements TestDao {
	final static String SQL_PREFIX = "test";
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<com.asto.domain.test.Test> queryAll() {
		return getSqlMapClientTemplate().queryForList(addSqlKeyPreFix(SQL_PREFIX, "queryAll"));
	}
	
}
