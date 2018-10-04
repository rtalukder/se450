package FactoryDemo;

public class IShapeFactory {
	private IShapeFactory() {}
	
	public static IShape createCircle(int radius) {
		int circumference = (int) (Math.PI * radius * 2);
		int area = (int) (Math.PI * radius * radius);
		return new Circle(circumference, area);
	}
	
	public static IShape createRectangle(int side1, int side2) {
		int perimeter = side1 + side1 + side2 + side2;
		int area = side1 * side2;
		return new Rectangle(perimeter, area);
	}
}
