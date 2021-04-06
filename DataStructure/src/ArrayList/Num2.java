package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Num2 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		numbers.add(4,50);
		System.out.println(numbers);
		System.out.println(numbers.indexOf(30));
		
		// numbers 객체엔 직접적인 반복작업이 존재하지않는다.
		// 따라서 Iterator를 통해 반복작업을 수행해준다.
		// Iterator는 메소드이다.
		
		/*
		Iterator it = numbers.iterator(); // it에 iterator 데이터타입으로 저장되는데, 이는 interface이다.
		System.out.println("iterator");
		
		while(it.hasNext()) {
			int value = (int) it.next(); // next 메소드는 numbers라고 하는 ArrayList가 가지고있는 데이터를 value에 넣어준다.
			if(value == 30){
			it.remove();
			}
			System.out.println(value);
		}
		
		System.out.println(numbers);
		*/
		
		
		for(int value : numbers) {
			System.out.println(value);
		}
		
		for(int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
		
	}

}
