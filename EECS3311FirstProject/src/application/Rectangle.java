package application;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Comparable <Shape>, Shape {//Comparable <Rectangle> (THIS IS WAT PROF PUT ORIGINALLY)
	protected int upperX;
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	public Rectangle(int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	
	//Method to draw rectangle
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
		//Return surface area of rectangle
		return width * height;
	}

	@Override
	public int compareTo(Shape other) {
		//Compares area of two shapes
		return this.surfaceArea() - other.surfaceArea();
	}
}
