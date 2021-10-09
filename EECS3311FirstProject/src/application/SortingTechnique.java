package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingTechnique {
	public List<Shape> sortShapes(List<Shape> shapeList) {
		//What to set coordinates of the shape in the current iteration
		int tempX = 50;
		int tempY = 50;
		
		//Shapes are sorted using selection sort
		//Goes through the whole array list
		for(int i = 0; i < shapeList.size() - 1; i++) {
			//Goes through every index after i to find the smallest shape size
			for(int j = i + 1; j < shapeList.size(); j++) {
				if(shapeList.get(i).compareTo(shapeList.get(j)) > 0) {
					//Not sure if necessary(Swap array positions on list)
					Collections.swap(shapeList, i, j);
				}
			}
			//Sets the shape of j to tempX and tempY
			//NOTE: Values of x and y may not be properly sorted during loop but is fixed when loop is finished
			shapeList.get(i).setUpperX(tempX);
			shapeList.get(i).setUpperY(tempY);
			
			//Increments by 75(like in ShapeFactory)
			tempX += 75;
			tempY += 75;
		}
		//This is done 1 extra time because loop doesn't check for the last element of array list
		shapeList.get(shapeList.size() - 1).setUpperX(tempX);
		shapeList.get(shapeList.size() - 1).setUpperY(tempY);
		
		//Increments by 75(like in ShapeFactory)
		tempX += 75;
		tempY += 75;
		
		return shapeList;
	}
}
