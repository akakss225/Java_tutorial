package LinkedList;

import java.util.LinkedList;

public class Num8 {

	public static void main(String[] args) {

		LinkedList nums = new LinkedList();
		
		nums.addFirst(30);
		nums.addFirst(20);
		nums.addFirst(10);
		nums.addLast(40);
		nums.addLast(50);
		nums.addLast(60);
		
		System.out.println(nums);
		System.out.println(nums.size());
		System.out.println(nums.get(0));
		

	}

}
