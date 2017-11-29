package org.factorypattern.learn;

import org.factorypattern.services.Shape;
import org.factorypattern.services.impl.Circle;
import org.factorypattern.services.impl.Rectangle;
import org.factorypattern.services.impl.Square;

public class ShapeFactory {

	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}
		if (shapeType.equals("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equals("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equals("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
