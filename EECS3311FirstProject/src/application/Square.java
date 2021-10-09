package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square implements Comparable <Shape>, Shape {
	protected int upperX;
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	public Square(int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	
	//Method to draw circle
	public void drawShape(Graphics form) {
		form.fillRect(upperX,  upperY,  width, height);
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
		 
	public void setWidth( int width) {
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
		//Returns surface area of the shape
		return width * width;
	}

	@Override
	public int compareTo(Shape other) {
		//Compares area of two shapes
		return this.surfaceArea() - other.surfaceArea();
	}
}
