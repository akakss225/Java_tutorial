package Array;

public class Num1 {

	public static void main(String[] args) {
		//일반적인 배열의 사용.
		String[] students = {"최진혁", "한이람", "최유빈", "한이은", "김주한"};
		
		for(int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
		
		//다양한 기능의 배열
		int[] numbers1 = new int[4]; //new를 사용함으로써 객체로써 만들어준다.
		String[] string = new String[4]; //여러가지 변수의 형태로 배열을 만들 수 있다.
		
		//배열에 값을 넣어주는 방식은 여러가지가 존재한다.
		
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
		
		int[] numbers2 = {10,20,30,40};
		int[] numbers3 = new int[] {10,20,30,40};
		
		System.out.println(numbers1[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers3[2]);
		System.out.println(numbers1[3]); // 기본적으로 객체로써 생성된 배열의 경우, 비어있는 곳에 null값을 넣기 때문에 0이 출력된다.
		System.out.println(numbers1.length); // length의 경우 값을 몇개나 세팅했는지는 고려하지 않음. 즉, 배열의 크기만을 알려줌
		
		// 기본적으로 배열의 경우 반복문을 통해 출력함.
		int j = 0;
		while(numbers1.length > j)
		{
			System.out.println(numbers1[j]);
			j++;
		}
		
		// 배열의 단점
		// 1. 크기가 정해져있다. << index error를 내기 쉬움. << 범용성이 적음.
		// 2. 기능이 없다 << 추가및 삭제등의 기능이 없음.
		// 배열의 장점
		// 1. 크기가 정해져있다. << 좋은 부품으로써의 역할. << 작고 가볍고 단순함.
		// 2. 기능이 없다. 
		
		
		
	}

}
