package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle implements Comparable<Shape>, Shape {
	protected int upperX;
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	public Circle(int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	
	//Method to draw circle
	public void drawShape(Graphics form) {
		form.fillOval(upperX,  upperY,  width, height);
	}

	//Getters
	public Color getColor() {
		return shapeColor;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
	    return height;
	}
	    
	public int getUpperX() {
		return upperX;
	}
		
	public int getUpperY() {
		return upperY;
	}
	
	//Setters
	public void setColor(Color aShapeColor) {
		this.shapeColor = aShapeColor;
	}
		 
	public void setWidth(int width) {
		this.width = width;
	}
		    
	public void setHeight(int height) {
			 this.height = height;
	}
		 
	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}
			
	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}

	public int surfaceArea() {
		//Return surface area of circle (PI r squared) (r is width divided by 2)
		return (int) (Math.PI * Math.pow(width / 2.0, 2.0));
	}

	@Override
	public int compareTo(Shape other) {
		//Compares area of two shapes
		return this.surfaceArea() - other.surfaceArea();
	}
}
