
//8. Write a Java program to extract a portion of a array list.

	package listDemo1;
	import java.util.ArrayList;
	import java.util.List;
	public class ExtractPortion {
	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
	System.out.println(list);

	List<Integer> subList = list.subList(2, 6);
	
	System.out.println(subList);
	
	}}
 //Using subList(int fromIndex, int toIndex) function,
 // we can extract a portion of element from given array list.