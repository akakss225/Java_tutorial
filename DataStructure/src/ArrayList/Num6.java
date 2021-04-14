package ArrayList;

public class Num6 {

	public static void main(String[] args) {

		ArrayList nums = new ArrayList();
		nums.addLast(10);
		nums.addLast(20);
		nums.addLast(30);
		nums.addLast(40);
		
		ArrayList.ListIterator li = nums.listIterator();
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30)
			{
				li.add(35);
			}
		}
		System.out.println(nums);
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30)
			{
				li.remove();
			}
		}
		System.out.println(nums);

	}

}
