package LinkedList;

public class Num4 {

	public static void main(String[] args) {
		
		LinkedList nums = new LinkedList();
		
		nums.addFirst(30);
		nums.addFirst(20);
		nums.addFirst(10);		
		nums.add(3, 15);
		
		System.out.println(nums.node(3));
		
		
	}

}
