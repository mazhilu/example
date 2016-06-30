package com.asto.trade.Factory;

import com.asto.trade.Factory.impl.Circle;
import com.asto.trade.Factory.impl.Rectangle;
import com.asto.trade.Factory.impl.Square;

/**
 * 工厂模式 根据制定参数获取制定的实例  创建工厂
 * 
 * @author liujx
 *
 */
public class ShapeFactory {
	public Shape getInstance(String shapeType) {
		do {
			if (shapeType == null) {
				break;
			}
			if (shapeType.equalsIgnoreCase("circle")) {
				return new Circle();
			} else if (shapeType.equalsIgnoreCase("square")) {
				return new Square();
			} else if (shapeType.equalsIgnoreCase("rectangle")) {
				return new Rectangle();
			}
		} while (false);
		return null;
	}
	
	
	
	
	
	/**
	 * 创建实例
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory sq = new ShapeFactory();
		Shape shape=sq.getInstance("circle");
		shape.draw();
		shape=sq.getInstance("square");
		shape.draw();
		shape=sq.getInstance("rectangle");
		shape.draw();
		
	}
	
}


