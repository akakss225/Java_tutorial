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
		
		// numbers ��ü�� �������� �ݺ��۾��� ���������ʴ´�.
		// ���� Iterator�� ���� �ݺ��۾��� �������ش�.
		// Iterator�� �޼ҵ��̴�.
		
		/*
		Iterator it = numbers.iterator(); // it�� iterator ������Ÿ������ ����Ǵµ�, �̴� interface�̴�.
		System.out.println("iterator");
		
		while(it.hasNext()) {
			int value = (int) it.next(); // next �޼ҵ�� numbers��� �ϴ� ArrayList�� �������ִ� �����͸� value�� �־��ش�.
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
