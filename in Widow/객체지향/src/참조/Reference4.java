package 참조;

public class Reference4 {
	
	static void _value(int b) {
		b = 2;
	}
	static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}
	
	
	static void _reference1(A b) {
		b = new A(2);
	}
	static void runReference1() {
		A a = new A(1);
		_reference1(a);
		System.out.println("runReference1, " + a.id);
	}
	//결국  A를 참조하는 a의 경우 1 을 담고있고, 새로은 A를 참조하는 b의 경우 2를 담는것을 의미한다. 
	//즉, 다른 주소를 사용하기 떄문에 a를 출력하면 1 이 나온다.
	
	
	static void _reference2(A b) {
		b.id = 2;
		
	}
	static void runReference2() {
		A a = new A(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id);
	}
	/* 여기서는 A를 참조하는 a의 경우 ,1을 받지만, b.id = 2 라는 값을 받게 되면, 
	 * 같은 A를 참조하는 b의 값이 바뀌기 때문에, 같은 주소를 사용하여 바꾼것이므로, a값 또한 바뀌게 된다.
	 */
			

	public static void main(String[] args) {

		runValue();
		runReference1();
		runReference2();

	}

}
