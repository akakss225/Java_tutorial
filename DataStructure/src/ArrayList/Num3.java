package ArrayList;

public class Num3 {

	public static void main(String[] args) {

		// ArrayList 구현방법
		ArrayList numbers = new ArrayList();
		

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		System.out.println(numbers);
		
		numbers.add(1, 15);
		
		System.out.println(numbers);
		
		numbers.addFirst(5);
		
		System.out.println(numbers);
		
		numbers.add(3,25);
		
		System.out.println(numbers);
		
		System.out.println(numbers.remove(1));
		System.out.println(numbers);
		
		numbers.removeFirst();
		System.out.println(numbers);
		
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
		
		
	}

}
