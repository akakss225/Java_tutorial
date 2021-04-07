package ArrayList;

public class Num4 {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		// 객체지향 관련된 일을 할 때, 전형적으로는 이러한 for문보다 iterator 패턴을 사용한다.
		/*
		for(int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
		*/
		
		ArrayList.ListIterator li = numbers.listIterator();
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next()); //nextIndex의 값은 메소드가 호출 될 때마다 1씩 증가하지만,
//		System.out.println(li.next()); //elementData에 저장된 값은 한계가 있기 떄문이다.
		
//		while(true)
//		{
//			System.out.println(li.next()); // 반복문이 일어난다. 다만 처음 지정해 주었던 list size인 100개 호출 이후엔, 에러를 만든다.
//		}
		// 위와같은 것을 방지하기위해 사용하는것이 hasNext이다.
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
	}

}
