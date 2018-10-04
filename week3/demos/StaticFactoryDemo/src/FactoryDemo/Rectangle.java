package FactoryDemo;

class Rectangle implements IShape {
	
	private final int perimeter;
	private final int area;
	
	public Rectangle(int perimeter, int area) {
		this.perimeter = perimeter;
		this.area = area;
	}
	
	public String getString(){
		return "Rectangle";	
	}

	@Override
	public int getArea() {
		return area;
	}

	@Override
	public int getPerimeter() {
		return perimeter;
	}
}
