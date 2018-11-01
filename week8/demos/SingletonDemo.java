public class SomeClass {
	private ISomeBehavior behavior;

	public SomeClass(ISomeBehavior behavior) {
		if (behavior == null)
			behavior = NullObject.getInstance();
		this.behavior = behavior;
	}
	public void doSomething() {
		behavior.doBehavior();
	}
}

public interface ISomeBehavior {
	void doBehavior();
}

public class SomeBehavior implements ISomeBehavior{
	public void doBehavior(){
		// stuff happens here
	}
}

public class NullObject implements ISomeBehavior {
	private static final NullObject instance = new NullObject();
	
	private NullObject() { }
	
	public static NullObject getInstance(){
		return instance;
	}
	
	public void doBehavior(){
		// Do nothing
	}
}

public static void main(String[] args) {
	ArrayList<SomeClass> list = new ArrayList<SomeClass>();
	for(int i = 0; i < Integer.MAX_VALUE; i++){
		list.add(new SomeClass(null));
	}
}


