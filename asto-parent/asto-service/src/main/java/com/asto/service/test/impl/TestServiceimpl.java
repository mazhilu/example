package com.asto.service.test.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.asto.domain.test.Test;
import com.asto.persist.test.TestDao;
import com.asto.service.test.TestService;

@Component("testService")
public class TestServiceimpl implements TestService{
	private TestDao testDao;

	@Override
	public List<Test> queryAll() {
		return testDao.queryAll();
	}

}
