package 참조;



public class Reference3 {
	
	public static void runValue() {
		int a = 1;
		int b = a; 
		b = 2; 
		System.out.println("runValue, " + a);
	}
	public static void runReference() {
		A a = new A(1); 
		A b = a;
		b = new A(2); //이는 다른 값을 저장하기 떄문에 당연히 다른 값을 출력한다.
		System.out.println("runReference, " + a.id);
	}

	public static void main(String[] args) {

		runValue();
		runReference();
		

	}

}
