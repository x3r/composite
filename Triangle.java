public class Triangle extends CompositeShape {
	private int xLeft, yTop, width;

	public Triangle(int xLeft, int yTop, int width) {
		super();
		this.xLeft = xLeft;
		this.yTop = yTop;
		this.width = width;
	}

	@Override
	public void buildShape() {
		shapes.add(new Line(xLeft, yTop, xLeft + width, yTop));
		shapes.add(new Line(xLeft, yTop, xLeft + width / 2, yTop - width / 2));
		shapes.add(new Line(xLeft + width / 2, yTop - width / 2, xLeft + width,
				yTop));
	}
}
