package ArrayList;

public class Num4 {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		

		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		// ��ü���� ���õ� ���� �� ��, ���������δ� �̷��� for������ iterator ������ ����Ѵ�.
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
//		System.out.println(li.next()); //nextIndex�� ���� �޼ҵ尡 ȣ�� �� ������ 1�� ����������,
//		System.out.println(li.next()); //elementData�� ����� ���� �Ѱ谡 �ֱ� �����̴�.
		
//		while(true)
//		{
//			System.out.println(li.next()); // �ݺ����� �Ͼ��. �ٸ� ó�� ������ �־��� list size�� 100�� ȣ�� ���Ŀ�, ������ �����.
//		}
		// ���Ͱ��� ���� �����ϱ����� ����ϴ°��� hasNext�̴�.
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		
		
	}

}
