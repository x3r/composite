public class House extends CompositeShape {
	int xLeft, yTop, height, width;

	public House(int xLeft, int yTop, int height, int width) {
		super();
		this.xLeft = xLeft;
		this.yTop = yTop;
		this.height = height;
		this.width = width;
	}

	@Override
	public void buildShape() {
		shapes.add(new Rectangle(xLeft, yTop, height, width));
		shapes.add(new Triangle(xLeft, yTop, width));
		shapes.add(new Rectangle(xLeft + width / 2, yTop + height / 2,
				height / 2, width / 3));
	}
}
