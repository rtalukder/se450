public interface ICarFactory { 
	IEngine createEngine(); 
	ICarBody createCarBody(); 
	IWheels createWheels(); 
} 

class ToyotaFactory implements ICarFactory {
	public IEngine createEngine(){
		return new ToyotaEngine();
	}
	
	public ICarBody createCarBody(){
		return new ToyotaCarBody();
	}
	
	public IWheels createWheels(){
		return new ToyotaWheels();
	}
}

class SubaruFactory implements ICarFactory {
	private ISomeDependency d
	
	public SubaruFactory(ISomeDependency d){
		this.d = d;
	}
	
	public IEngine createEngine(){
		return new SubaruEngine();
	}
	
	public ICarBody createCarBody(){
		return new SubaruCarBody();
	}
	
	public IWheels createWheels(){
		return new SubaruWheels();
	}
}