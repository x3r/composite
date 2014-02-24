import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
	public static void main(String[] args) {
		JFrame app = new JFrame("Village");
		app.setVisible(true);
		app.setSize(1100, 400);
		app.add(new Test());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new House(200, 200, 60, 100));
		shapes.add(new House(350, 200, 60, 100));
		shapes.add(new House(700, 300, 40, 60));
		shapes.add(new Tree(880, 240, 20, 100));
		shapes.add(new House(800, 200, 40, 60));
		shapes.add(new Tree(980, 240, 20, 100));
		shapes.add(new House(900, 200, 40, 60));
		shapes.add(new Tree(1080, 240, 20, 100));
		shapes.add(new House(1000, 200, 40, 60));
		shapes.add(new Tree(100, 300, 40, 200));
		shapes.add(new Tree(50, 300, 20, 100));
		shapes.add(new Tree(600, 350, 20, 100));
		shapes.add(new Tree(650, 350, 20, 100));
		shapes.add(new Tree(650, 150, 20, 100));
		shapes.add(new Tree(700, 150, 20, 100));
		shapes.add(new Tree(750, 150, 20, 100));
		shapes.add(new River(new Point(550, 0), new Point(450, 400)));
		for (Shape shape : shapes)
			shape.draw(g);
	}

}
