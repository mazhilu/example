package com.asto.trade.abstractFactory.impl;

import com.asto.trade.abstractFactory.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle(矩形)");
	}
	
}
