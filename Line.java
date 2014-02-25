import java.awt.Graphics;

public class Line extends Shape {
<<<<<<< HEAD
=======

>>>>>>> f93f36c8e343333b3fba0d35717367dcef79c4d8
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
	}

}
