package org.abstractfactorypattern.learn;

import org.factorypattern.services.Color;
import org.factorypattern.services.Shape;

public abstract class AbstractFactory {
	abstract Color getcolor(String color);
	abstract Shape getShape(String shape);
}
