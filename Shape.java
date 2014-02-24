import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class Shape extends JPanel {
	public static ArrayList<Shape> shapes = new ArrayList<Shape>();

	Graphics g;

	public void draw(Graphics g) {
		buildShape();
		this.g = g;
		for (Shape shape : shapes)
			shape.draw(g);
	}

	public abstract void buildShape();
}
