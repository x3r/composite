import java.util.ArrayList;
import java.util.List;


public class Village extends CompositeShape{
	private List<IShape>compositeShapes= new ArrayList<>();
	
	public Village(List<IShape> compositeShapes) {
		this.compositeShapes = compositeShapes;
	}

	@Override
	protected void buildShape() {
		for(IShape shape:compositeShapes)
			shapes.add(shape);
	}
}
