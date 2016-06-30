package com.asto.persist.test;

import java.util.List;

import com.asto.domain.test.Test;

public interface TestDao {
	public List<Test> queryAll();
}
