package application;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeFactory {
	//This method creates 6 random shapes
	List<Shape> shapeList;
	public List<Shape> createShapes() {
		shapeList = new ArrayList<Shape>();
		Random random = new Random(); //Random class to generate random int
		int xSelect = 50; //Relative location on GUI(Starts at 50 and increments by 75)
		int ySelect = 50; //Relative location on GUI(Starts at 50 and increments by 75)
		int shapeSelect = 0; //Number between 1 and 3 to decide which shape to make
		int widthSelect = 0; //Width between 10 and 75
		int heightSelect = 0; //Height between 10 and 75 (ONLY USED FOR RECTANGLES)
		int color1 = 0; //Number between 1 and 255 (For red colouring)
		int color2 = 0; //Number between 1 and 255 (For green colouring)
		int color3 = 0; //Number between 1 and 255 (For blue colouring)
		Color colorSelect = new Color(0, 0, 0); //Colour to use
		Shape toCreate = new Rectangle(0, 0, 0, 0, colorSelect); //Used to create shapes
		
		//Creates 6 shapes randomly
		for(int i = 0; i < 6; i ++) {
			shapeSelect = random.nextInt(3) + 1; //Selects number between 1 and 3
			widthSelect = random.nextInt(66) + 10; //Selects number between 1 and 75
			heightSelect = random.nextInt(66) + 10; //Selects number between 1 and 75
			color1 = random.nextInt(255) + 1; //Selects number between 1 and 255
			color2 = random.nextInt(255) + 1;
			color3 = random.nextInt(255) + 1;
			
			//Selects the color to be used in the shape
			colorSelect = new Color(color1, color2, color3);
			
			//Chooses which shape to make depending on the random number
			if(shapeSelect == 1) { //Create new rectangle
				toCreate = new Rectangle(xSelect, ySelect, widthSelect, heightSelect, colorSelect);
			}else if (shapeSelect == 2) { //Create new Square
				toCreate = new Square(xSelect, ySelect, widthSelect, widthSelect, colorSelect);
			}else if (shapeSelect == 3) { //Create new Circle
				toCreate = new Circle(xSelect, ySelect, widthSelect, widthSelect, colorSelect);
			}
			
			//Iterates x and y location by 75 after each loop
			xSelect += 75;
			ySelect += 75;
			
			shapeList.add(toCreate); //Adds shape to list after each iteration
		}
		return shapeList;
	}
	
}
