public class ImmutableMutableDemo {
	public static void main(String[] args) {
		AnotherMutableObject o1 = new AnotherMutableObject("Hello");
		MutableObject o = new MutableObject(o1, 3);
		ImmutableObject io = new ImmutableObject("World", o);
		System.out.println(io.o.o.s);
		io.o.o.s = "asd";
		System.out.println(io.o.o.s);
	}
}

class ImmutableObject {
	public final String s;
	public final MutableObject o;
	
	public ImmutableObject(String s, MutableObject o) {
		this.s = s;
		this.o = new MutableObject(o.o, o.i);
	}
}

class MutableObject {
	public int i;
	public AnotherMutableObject o;
	
	public MutableObject(AnotherMutableObject o, int i){
		this.i = i;
		this.o = o;
	}
	
	public void setI(int i){
		this.i = i;
	}
}

class AnotherMutableObject {
	public String s;
	
	public AnotherMutableObject(String s){
		this.s = s;
	}
	
	public void setS(String s){
		this.s = s;
	}
}