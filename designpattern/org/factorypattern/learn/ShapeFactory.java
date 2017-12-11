package org.factorypattern.learn;

import org.factorypattern.services.Shape;
import org.factorypattern.services.impl.Circle;
import org.factorypattern.services.impl.Rectangle;
import org.factorypattern.services.impl.Square;

public class ShapeFactory {
	
	public Shape getShape(String type) {
		
		if(type == null) {
			return null;
		}else if (type.equals("CIRCLE")) {
			return new Circle();
		}else if (type.equals("SQUARE")) {
			return new Square();
		}else if (type.equals("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
}
