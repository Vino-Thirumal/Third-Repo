
//9. Write a Java program of swap two elements in an array list.

	package listDemo1;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	public class SwapTwoElements {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);		
		
	System.out.println("List Before Swapping " + list);
	
		Collections.swap(list, 2,0);
		
	System.out.println("List After Swapping " + list);
	}
  }
//Collections.swap(list, int i, int j) 
//function swaps any 2 elements using index value in arraylist.
//Here, 2nd index value is swapped to 0th index.