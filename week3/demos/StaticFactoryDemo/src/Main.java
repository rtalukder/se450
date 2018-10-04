import java.security.InvalidParameterException;
import FactoryDemo.*;
public class Main {

	public static void main(String[] args) {

		String shapeType = "rectangle";
		IShape shape;
		if(shapeType.toLowerCase().equals("circle")){
			shape = IShapeFactory.createCircle(43);
		}
		else if (shapeType.toLowerCase().equals("rectangle")){
			shape = IShapeFactory.createRectangle(23, 12);
		}
		else{
			throw new InvalidParameterException("Parameter must be the correct shape");
		}
		
		System.out.println(shape.getString());
	}

}
