package com.asto.trade.abstractFactory;

import com.asto.trade.abstractFactory.impl.Circle;
import com.asto.trade.abstractFactory.impl.Rectangle;
import com.asto.trade.abstractFactory.impl.Square;

public class ShapeFactory extends AbstratFactory{

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		do{
			if(shapeType==null){
				break;
			}
			if(shapeType.equalsIgnoreCase("CIRCLE")){
				return new Circle();
			}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
				return new Rectangle();
			}else if(shapeType.equalsIgnoreCase("SQUARE")){
				return new Square();
			}
		}while(false);
		return null;
	}
	
}
