package org.abstractfactorypattern.learn;

import org.factorypattern.services.Color;
import org.factorypattern.services.Shape;

public class AbstractFactroyPattern {
	
	public static void main(String[] args) {
		
		AbstractFactory abstractFactoryShape = FactroyProducer.getFactory("SHAPE");
		AbstractFactory abstractFactoryColor = FactroyProducer.getFactory("COLOR");
		
		Shape shape1 = abstractFactoryShape.getShape("RECTANGLE");
		shape1.draw();
		
		Color color1 = abstractFactoryColor.getcolor("RED");
		color1.fill();
		
	}
}
