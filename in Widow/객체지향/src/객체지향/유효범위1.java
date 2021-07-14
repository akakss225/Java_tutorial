package 객체지향;

public class 유효범위1 {
//같은 이름을 사용하면, 의미의 충돌이 일어날 수 있다. 이를 해결하기 위하여 고안된 방법이 바로 유효범위(Scope)이다.
	
	static void a() {
		int i = 0;
	}
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++)
		{
			/*이때 메소드 a 내부의 변수 i는 메소드 내부에서만 유효하게 된다
			 * 즉, 메소드 바깥에서는 작동하지 않게하는 이러한 방법을 유효범위라고 한다.
			 */
		
			a();
			System.out.println(i);
		}

	}

}
