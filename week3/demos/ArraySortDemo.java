import java.util.*;
public class ArraySortDemo {
	public static void main(String[] args){
		Integer[] ints = new Integer[10];
		Integer value = 10;
		for(int i = 0; i < ints.length; i++) {
			ints[i] = value--;
			System.out.println(ints[i]);
		}
		
		System.out.println("\nSorting...");
		Arrays.sort(ints, (Integer i1, Integer i2) -> i2 - i1);
		
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}
}