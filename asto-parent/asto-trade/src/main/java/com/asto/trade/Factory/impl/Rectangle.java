package com.asto.trade.Factory.impl;

import com.asto.trade.Factory.Shape;

/**
 * 工厂模式演示
 * @author liujx
 *
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("矩形");
	}
	
}
