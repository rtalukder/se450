public class BindingDemo7 {
  public static void main(String[] argv) {
    (new C()).m();
  }
}
class A {
  void p() {System.out.println("A.p");}
}
class B extends A {
  void p() {System.out.println("B.p");}
  void m() {
    System.out.println("B.m");
    this.p();  // Which p?
    super.p(); // Which p?
  }
}
class C extends B {
  void p() {
	  System.out.println("C.p");
	  super.p();
  }
}
