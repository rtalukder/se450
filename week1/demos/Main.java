import java.security.InvalidParameterException;

public class Main { 
	public static void main(String[] args){ 
		StringObject x = new StringObject("hello"); 
		StringObject y = new StringObject("world"); 
		x.swap(y); 
		System.out.println(x); 
		System.out.println(y); 
	}
} 
class StringObject{ 
	public String str; 
	public StringObject(String str){ this.str = str; } 
	public String toString(){ return str; } 
	
	public void swap(StringObject a){ 
		if(a == null)
			throw new InvalidParameterException("StringObject was null.");
			
		String t = a.str; 
		a.str = str; 
		str = t; 
	}  
}

