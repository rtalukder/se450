class Car {
	public Color color;
	public int length;
}

class CarFlyweight {
	public Car car;
	public int velocity;
	public int position;
}

class FlyweightFactory {
	private Car car = new Car(Color.Blue, 8);
	private Car suv = new Car(Color.Green, 10);
	private Car truck = new Car(Color.Red, 25);
	
	public CarFlyweight createCar(int velocity, int position){
		return new CarFlyweight(car, velocity, position);
	}
	
	public CarFlyweight createSuv(){
		return new CarFlyweight(suv, velocity, position);
	}
	
	public CarFlyweight createTruck(){
		return new CarFlyweight(truck, velocity, position);
	}
}