package com.asto.trade.abstractFactory.impl;

import com.asto.trade.abstractFactory.Shape;


public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Square(正方形)");
	}
	
}
