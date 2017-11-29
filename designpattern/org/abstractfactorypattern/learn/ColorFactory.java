package org.abstractfactorypattern.learn;

import org.factorypattern.services.Color;
import org.factorypattern.services.Shape;
import org.factorypattern.services.impl.Blue;
import org.factorypattern.services.impl.Green;
import org.factorypattern.services.impl.Red;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getcolor(String color) {
		
		if (color == null) {
			return null;
		}
		if (color.equals("RED")) {
			return new Red();
		} else if (color.equals("GREEN")) {
			return new Green();
		} else if (color.equals("BLUE")) {
			return new Blue();
		}
		return null;
	
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

	
}
