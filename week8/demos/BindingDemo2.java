public class BindingDemo2 {
  public static void main(String[] argv) {
    (new B()).m();
  }
}
class A {
  static void p() {
	System.out.println("A.p");
  } 
  void m() { 
    System.out.println("A.m"); 
    this.p(); // which p?
  } 
} 

class B extends A { 
  static void p() {
	System.out.println("B.p");
  } 
}
