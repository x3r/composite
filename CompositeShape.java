import java.awt.Graphics;
import java.util.ArrayList;

public abstract class CompositeShape implements IShape {
	protected ArrayList<IShape> shapes = new ArrayList<IShape>();

	@Override
	public void draw(Graphics g) {
		buildShape();
		for (IShape shape : shapes)
			shape.draw(g);
	}

	protected abstract void buildShape();
}
