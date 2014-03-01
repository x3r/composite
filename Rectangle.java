public class Rectangle extends CompositeShape {
	int xleft;
	int ytop;
	int height;
	int width;

	public Rectangle(int xleft, int ytop, int height, int width) {
		this.xleft = xleft;
		this.ytop = ytop;
		this.height = height;
		this.width = width;
	}

	@Override
	protected void buildShape() {
		shapes.add(new Line(xleft, ytop, xleft + width, ytop));
		shapes.add(new Line(xleft, ytop + height, xleft + width, ytop + height));
		shapes.add(new Line(xleft, ytop, xleft, ytop + height));
		shapes.add(new Line(xleft + width, ytop, xleft + width, ytop + height));
	}

}
