
//11. Write a Java program to trim the virtual capacity
 //of an array list the current list size.

	package listDemo1;
	import java.util.ArrayList;
	public class TrimArrayListSize {
	public static void main(String[] args) {

	ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
	System.out.println("Original Array List " + al);
	
	al.trimToSize();
	
	System.out.println("Array List after trim to Size " + al);
	}
}
