import java.util.Date;
import java.util.Hashtable;
// example from http://www.vipan.com/htdocs/hashcode_help.html
public class HashingMutableDataDemo {
  public static void main (String[] args) {

    Hashtable<Date,String> map = new Hashtable<Date,String>();
    long time = System.currentTimeMillis();
    Date dt1 = new Date(time);
    Date dt2 = new Date(time);
    map.put(dt1, "blah");

    System.out.println("dt1.toString() = " + dt1.toString());
    System.out.println("dt2.toString() = " + dt2.toString());
    System.out.println("Is dt2.equals(dt1)? = " + dt2.equals(dt1));
    System.out.println("map.get(dt1) = " + map.get(dt1) );
    System.out.println("map.get(dt2) = " + map.get(dt2) );
	System.out.println("dt1 hash = " + dt1.hashCode());
	System.out.println("dt2 hash = " + dt2.hashCode());
	
    // Change dt by adding a day to its time
    dt1.setTime(time + 24*60*60*1000L);

    System.out.println("\nAfter dt.setTime(newTime):");
    System.out.println("dt1.toString() = " + dt1.toString());
    System.out.println("dt2.toString() = " + dt2.toString());
    System.out.println("Is dt2.equals(dt1)? = " + dt2.equals(dt1));
    System.out.println("map.get(dt1) = " + map.get(dt1) );
    System.out.println("map.get(dt2) = " + map.get(dt2) );
	System.out.println("dt1 hash = " + dt1.hashCode());
	System.out.println("dt2 hash = " + dt2.hashCode());

	
    System.out.println("\nmap = " + map.toString() );
  }
}
