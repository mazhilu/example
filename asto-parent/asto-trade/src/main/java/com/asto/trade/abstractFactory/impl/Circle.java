package com.asto.trade.abstractFactory.impl;

import com.asto.trade.abstractFactory.Shape;


public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.print("Circle(圆形)");
	}

}
