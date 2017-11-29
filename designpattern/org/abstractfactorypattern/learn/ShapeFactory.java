package org.abstractfactorypattern.learn;

import org.factorypattern.services.Color;
import org.factorypattern.services.Shape;
import org.factorypattern.services.impl.Circle;
import org.factorypattern.services.impl.Rectangle;
import org.factorypattern.services.impl.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getcolor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shape) {

		if (shape == null) {
			return null;
		}
		if (shape.equals("CIRCLE")) {
			return new Circle();
		} else if (shape.equals("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equals("SQUARE")) {
			return new Square();
		}
		return null;
	
	}

}
