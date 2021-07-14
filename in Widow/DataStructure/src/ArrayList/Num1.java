package ArrayList;

import java.util.ArrayList;

public class Num1 {

	public static void main(String[] args) {
		
		// Data를 삭제하거나 추가할 때 시간이 많이 소요됨.
		// 반대로 index값을 알고있을 때 Data를 불러오는게 매우 쉬움.
		
		ArrayList<Integer> numbers = new ArrayList<>();
		

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		
		System.out.println(numbers);
		
		numbers.add(1,50); // 1번째 index에 50이란 값을 추가.
		
		System.out.println(numbers);
		
		numbers.remove(2); // index number로써 삭제.
		
		System.out.println(numbers);
		
		System.out.println(numbers.get(3));
		
		System.out.println(numbers.size());
		
		
		
	}

}
