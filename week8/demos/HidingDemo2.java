class A {
	int i;
	public A(int i){
		this.i = i;
	}
	public int count(int limit){
		for(int it = 0; it < limit; it++){
			i++;
		}
		
		return i;
	}
	
	public int getI(){
		return i;
	}
}

class B extends A {
	int i;
	public B(int i) { 
		super(i); 
		this.i = i + 10;
	}
}

public class HidingDemo2 {
	public static void main(String[] args){
		B b = new B(10);
		A a = new B(100);
		
		System.out.println(b.i);
		
		System.out.println(b.getI());
		System.out.println(a.getI());
		
		b.count(15);
		a.count(15);
		
		System.out.println(b.getI());
		System.out.println(a.getI());
	}
}