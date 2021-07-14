package 객체지향;

public class 유효범위3 {
	
	static int i = 5;

	static void a() {
		/*매소드 a 의 i는 매소드 내부의 지역변수 i를 차용하지만, 
		 * main매소드에서 최초로 호출된 a의 경우, b매소드를 사용하고,
		 * 매소드 b의 경우 b내부에 따로 지정된 지역변수가 없을 시 전역변수를 차용하기 때문에
		 * 결과적으로 전역변수 i가 호출된다.
		 */
		
		int i = 10;
		b();
	}
	
	static void b() {
		
		//매소드 b의 i는 지역변수 지정이 없다면, 전역변수 i를 사용한다.
		//int i = 30;
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		//main메소드에서의 지역변수 i는 매소드 b와는 무관하기 때문에 전역변수가 호출된다.
		int i = 1;

		a();
		
		
		//이러한 형태의 유효범위 스타일을 '정적인 유효범위'라고 한다.

	}

}
