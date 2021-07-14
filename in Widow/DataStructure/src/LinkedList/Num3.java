package LinkedList;

public class Num3 {

	public static void main(String[] args) {
		
		
		LinkedList nums = new LinkedList();
		
		nums.addFirst(30);
		nums.addFirst(20);
		nums.addFirst(10);
		nums.addLast(40);
		nums.addLast(50);
		nums.addLast(60);
		
		System.out.println(nums.node(0));
		System.out.println(nums.node(1));
		System.out.println(nums.node(2));
		System.out.println(nums.node(3));
		System.out.println(nums.node(4));
		System.out.println(nums.node(5));
		}

}
