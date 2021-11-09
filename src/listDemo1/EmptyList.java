
//10. Write a Java program to empty an array list.
	
	package listDemo1;
	import java.util.ArrayList;
	import java.util.List;
	public class EmptyList {	
	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
	System.out.println(list);
	
	list.clear();
	System.out.println(list);
	
	//clear() function makes the array list empty.
	//to check the array list is empty- we can use isEmpty() function. 
	
	boolean empty = list.isEmpty();
	System.out.println(empty);
	}}
