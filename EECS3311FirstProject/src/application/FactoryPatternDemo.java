package application;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FactoryPatternDemo extends JPanel {
	private static final long serialVersionUID = 1L;
	static List<Shape> shapeList;
	static ShapeFactory shapes = new ShapeFactory();
	static SortingTechnique sorter = new SortingTechnique();
	static boolean paintShapes = false;
	
	public void paintComponent(Graphics g) {
		//When load/sort shapes is clicked, paintShapes are set to true which displays the shapes to the user
		if(paintShapes == true) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			for(Shape shape: shapeList) {
				g2d.setColor(shape.getColor());
				shape.drawShape(g2d);
			}
		}
	}
	
	//Main method of class
	public static void main(String[] args) {
		//TO CHANGE (MAYBE NOT)
		JFrame frame = new JFrame("Display shapes");
		FactoryPatternDemo panel = new FactoryPatternDemo();
		
		//Panel for buttons
		panel.setLayout(new FlowLayout());
		
		//Button to Load shapes
		JButton loadButton = new JButton();
		loadButton.setText("Load shapes");
		
		//This load button displays the shapes on click
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//On click, creates 6 random shapes with random lengths and widths
				shapeList = shapes.createShapes();
				
				//On click, makes paintComponent true which draws the shapes
				paintShapes = true;
				panel.repaint();
			}
		});
		
		//Button to Sort shapes
		JButton sortButton = new JButton();
		sortButton.setText("Sort shapes");
		
		//This sort button sorts the shapes on click
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//On click, sorts the shapes based on their area.
				shapeList = sorter.sortShapes(shapeList);
				
				panel.revalidate();
				panel.repaint();
			}
		});
		
		//Add buttons to panel
		panel.add(loadButton);
		panel.add(sortButton);
		
		//Sets up the frame
		frame.add(panel);
		frame.setSize(600, 600);//Size of frame should be at least 600 x 600
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
