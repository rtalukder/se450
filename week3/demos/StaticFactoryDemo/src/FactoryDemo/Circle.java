package FactoryDemo;

class Circle implements IShape {
	
	private final int circumference;
	private final int area;
	
	public Circle(int circumference, int area) {
		this.circumference = circumference;
		this.area = area;
	}
	
	public String getString(){
		return "Circle";	
	}

	@Override
	public int getArea() {
		return area;
	}

	@Override
	public int getPerimeter() {
		return circumference;
	}
}
