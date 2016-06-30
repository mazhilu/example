package com.asto.trade.abstractFactory;

import com.asto.trade.abstractFactory.impl.Blue;
import com.asto.trade.abstractFactory.impl.Green;


public class ColorFactory extends AbstratFactory{

	@Override
	public Color getColor(String colorType) {
		do{
		if(colorType==null){
			break;
		}	
		if(colorType.equalsIgnoreCase("green")){
			return new Green();
		}else if(colorType.equalsIgnoreCase("Bule")){
			return new Blue();
		}
		}while(false);
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
