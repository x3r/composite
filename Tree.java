public class Tree extends Shape {
	private int xLeft, yTop, leafSize, treeHeight;

	public Tree(int xLeft, int yTop, int leafSize, int treeHeight) {
		super();
		this.xLeft = xLeft;
		this.yTop = yTop;
		this.leafSize = leafSize;
		this.treeHeight = treeHeight;
	}

	@Override
	public void buildShape() {
		shapes.add(new Line(xLeft, yTop, xLeft, yTop - treeHeight - leafSize));
		Point upperLeft = new Point(xLeft - leafSize, yTop - treeHeight
				- leafSize);
		Point lowerLeft = new Point(xLeft - leafSize, yTop - treeHeight
				+ leafSize);
		Point upperRight = new Point(xLeft + leafSize, yTop - treeHeight
				- leafSize);
		Point lowerRight = new Point(xLeft + leafSize, yTop - treeHeight
				+ leafSize);
		shapes.add(new Line(upperLeft.x, upperLeft.y, lowerRight.x,
				lowerRight.y));
		shapes.add(new Line(upperRight.x, upperRight.y, lowerLeft.x,
				lowerLeft.y));
		shapes.add(new Line(xLeft - leafSize, yTop - treeHeight, xLeft
				+ leafSize, yTop - treeHeight));
		shapes.add(new Line(xLeft - 5, yTop, xLeft + 5, yTop));
	}
}
