public class House extends Shape {
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
		Rectangle r = new Rectangle(xLeft, yTop, height, width);
		r.buildShape();
		Triangle t = new Triangle(xLeft, yTop, width);
		t.buildShape();
		Rectangle houseDoor = new Rectangle(xLeft + width / 2, yTop + height
				/ 2, height / 2, width / 3);
		houseDoor.buildShape();
	}
}
