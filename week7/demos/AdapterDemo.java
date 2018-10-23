package ThirdPartyPackage; 
public interface IShape { 
	int getPerimeter(); 
	int getArea(); 
} 
public class ShapeFactory { 
	public static IShape createTriangle(); 
	public static IShape createCircle(); 
	public static IShape createSquare(); 
} 


//-----------------------------------------------------

package myPackage;

public interface MyIShape extends IShape {
	int getPerimeter(); 
	int getArea(); 
	Color getColor();
}

public class MyTriangle implements MyIShape {
	IShape shape;
	Color color;
	
	public MyTriangle(Color color){
		shape = ShapeFactory.createTriangle();
		this.color = color;
	}
	
	public int getPerimeter(){
		return shape.getPerimeter();
	}
	
	public int getArea(){
		return shape.getArea();
	}
	
	public Color getColor(){
		return color;
	}
}










