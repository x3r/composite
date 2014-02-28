public class River extends CompositeShape {
	Point top, bottom;

	public River(Point top, Point bottom) {
		this.top = top;
		this.bottom = bottom;
	}

	@Override
	public void buildShape() {
		shapes.add(new Line(bottom.x, bottom.y, top.x, top.y));
		shapes.add(new Line(bottom.x + 50, bottom.y, top.x + 50, top.y));
	}
}
