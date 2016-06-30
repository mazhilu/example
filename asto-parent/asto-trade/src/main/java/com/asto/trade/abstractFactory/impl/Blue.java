package com.asto.trade.abstractFactory.impl;

import com.asto.trade.abstractFactory.Color;

public class Blue implements Color{

	@Override
	public void fill() {
		System.out.println("Blur(蓝色)");
	}
	
}
