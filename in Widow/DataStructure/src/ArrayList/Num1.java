package ArrayList;

import java.util.ArrayList;

public class Num1 {

	public static void main(String[] args) {
		
		// Data�� �����ϰų� �߰��� �� �ð��� ���� �ҿ��.
		// �ݴ�� index���� �˰����� �� Data�� �ҷ����°� �ſ� ����.
		
		ArrayList<Integer> numbers = new ArrayList<>();
		

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		
		System.out.println(numbers);
		
		numbers.add(1,50); // 1��° index�� 50�̶� ���� �߰�.
		
		System.out.println(numbers);
		
		numbers.remove(2); // index number�ν� ����.
		
		System.out.println(numbers);
		
		System.out.println(numbers.get(3));
		
		System.out.println(numbers.size());
		
		
		
	}

}
