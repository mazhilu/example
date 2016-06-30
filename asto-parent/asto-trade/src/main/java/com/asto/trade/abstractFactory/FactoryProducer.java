package com.asto.trade.abstractFactory;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 * 
 * @author liujx
 *
 */
public class FactoryProducer {
	public static AbstratFactory getFactory(String choice) {
		do {
			if(choice==null){
				break;
			}
			if(choice.equals("shape")){
				return new ShapeFactory();
			}else if(choice.equals("color")){
				return new ColorFactory();
			}
		} while (false);
		return null;
	}
	
	
	
	
	/**
	 * 测试
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		FactoryProducer ap = new FactoryProducer();
		AbstratFactory shapeFactory=ap.getFactory("shape");
		Shape shape = shapeFactory.getShape("circle");
		shape.draw();
		
		shape = shapeFactory.getShape("RECTANGLE");
		shape.draw();
		
		shape = shapeFactory.getShape("SQUARE");
		shape.draw();
		
		AbstratFactory colorFactory=ap.getFactory("color");
		Color color=colorFactory.getColor("green");
		color.fill();
		
		color=colorFactory.getColor("bule");
		color.fill();
	}
}
