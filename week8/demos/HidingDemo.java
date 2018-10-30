class A {
	int i;
	public A(int i){
		this.i = i;
	}
	public int count(int limit){
		int i = 0;
		
		for(int it = 0; it < limit; it++){
			i++;
		}
		
		return i;
	}
	
	public int getI(){
		return i;
	}
}

public class HidingDemo {
	public static void main(String[] args){
		A a = new A(45);
		System.out.println(a.getI());
		
		int result = a.count(10);
		System.out.println(result);
		System.out.println(a.getI());
		
	}
}