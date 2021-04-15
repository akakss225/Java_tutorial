package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Num10 {

	public static void main(String[] args) {

		LinkedList nums = new LinkedList();
		
		nums.addFirst(30);
		nums.addFirst(20);
		nums.addFirst(10);
		nums.addLast(40);
		nums.addLast(50);
		nums.addLast(60);

		ListIterator i = nums.listIterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
	}

}
