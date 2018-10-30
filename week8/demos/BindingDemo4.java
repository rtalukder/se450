public class BindingDemo4 {
  public static void main(String[] argv) {
    O o = new X();
    I i = o.getI();
    i.m();
  }
}
interface I { public void m(); }
class O {
  void p() {System.out.println("O.p");}
  I getI() {
    //return () -> O.this.p();
    return new I() {
      public void m() {
        O.this.p(); // which p?
      }};
  }
}
class X extends O {
  void p() {System.out.println("X.p");}
}