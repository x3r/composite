import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Line extends Shape {
//	JPanel jPanel = new JPanel();

	int xLeft, xRight, yTop, yBottom;

	public Line(int xLeft, int yTop, int xRight, int yBottom) {
		super();
		this.xLeft = xLeft;
		this.xRight = xRight;
		this.yTop = yTop;
		this.yBottom = yBottom;
	}

	@Override
	public void buildShape() {
		shapes.add(new Line(xLeft, yTop, xRight, yBottom));
	}

	public void draw(Graphics g) {
		g.drawLine(xLeft, yTop, xRight, yBottom);
		System.out.println("Drawn");
	}

}
