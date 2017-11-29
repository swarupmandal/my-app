package org.factorypattern.learn;

import org.factorypattern.services.Shape;

public class FactoryPattern {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("CIRCLE");
		shape.draw();
	}
	
}
