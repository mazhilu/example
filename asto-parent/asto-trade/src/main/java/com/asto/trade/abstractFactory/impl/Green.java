package com.asto.trade.abstractFactory.impl;

import com.asto.trade.abstractFactory.Color;

public class Green implements Color{

	@Override
	public void fill() {
		System.out.println("Green(绿色)");
	}
	
}
