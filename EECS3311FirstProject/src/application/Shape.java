package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public interface Shape{
	Color getColor();
	void drawShape(Graphics form);
	int surfaceArea();
	int compareTo(Shape shape);
	int getWidth();
	int getHeight();
	int getUpperX();
	int getUpperY();
	void setUpperX(int upperX);
	void setUpperY(int upperY);
}
