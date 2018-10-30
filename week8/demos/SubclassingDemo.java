public class SubclassingDemo {
	public static void main(String[] args) {
		C c = new C();
		c = new D();
	}
}

class C {
	int i;
	public C() {
		System.out.println(i);
		System.out.println("C");
		i = 27;
		System.out.println(i);
	}
}

class D extends C {
	public D(){
		super();
		System.out.println("D");
	}
}


