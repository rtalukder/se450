class A {
	int i;
	public A(int i){
		this.i = i;
	}
	public int getI(){
		return i;
	}
}

class B extends A {
	public B(int i) { super(i); }
	/*public int getI(){
		return 789;
	}*/
}

public class SubclassingDemo2 {
	public static void main(String[] args){
		A a = new A(45);
		System.out.println(a.getI());
		B b = new B(64);
		System.out.println(b.getI());
		
		a = b;
		
		System.out.println(a.getI());
		
	}
}