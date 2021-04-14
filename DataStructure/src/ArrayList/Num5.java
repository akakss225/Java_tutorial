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
		System.out.println(li.previous()); // 이 떄 사실 li.next()에는 40 이후 빈 index를 가리키고있지만, previous는 1을 감소시키고 출력하기 때문에 가능하다.
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
		*/
	}

}
