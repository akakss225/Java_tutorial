package ArrayList;

public class Num5 {

	public static void main(String[] args) {

		ArrayList nums = new ArrayList();
		nums.addLast(10);
		nums.addLast(20);
		nums.addLast(30);
		nums.addLast(40);
		
		ArrayList.ListIterator li = nums.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		/*
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.previous()); // �� �� ��� li.next()���� 40 ���� �� index�� ����Ű��������, previous�� 1�� ���ҽ�Ű�� ����ϱ� ������ �����ϴ�.
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
		*/
	}

}
