public class PairDemo {
  public static void main (String[] args) {
    PairBuilder pb1 = new PairBuilder();
    pb1.setFirst("cat");
    pb1.setSecond("dog");
    Pair p1 = pb1.toPair();
	System.out.println("p1: " + p1.toString());
	
    PairBuilder pb2 = new PairBuilder();
    pb2.setFirst("green");
    pb2.setSecond("blue");
    pb2.setFirst("red");
	
    Pair p2 = pb2.toPair();
  	System.out.println("p2: " + p2.toString());
	
	pb2.setFirst("yellow");
    Pair p3 = pb2.toPair();
	  System.out.println("p3: " + p3.toString());
	  System.out.println("p2: " + p2.toString());
  }
}

final class Pair {
  private String x;
  private String y;
  
  public Pair(String x, String y){
	  this.x = x;
	  this.y = y;
  }
  
  public String toString() {
	  return "x = " + x + "; y = " + y;
  }
}

final class PairBuilder {
  private String x;
  private String y;
  public PairBuilder() { }
  public void setFirst(String x) { this.x = x; }
  public void setSecond(String y) { this.y = y; }
  public Pair toPair() {
    if (x == null || y == null)
      throw new NullPointerException();
    return new Pair(x,y);
  }
}