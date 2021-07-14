package 객체지향;



public class 유효범위2 {
//정적변수 지정시, 클래스 전역에 영향을 미칠 수 있음. 엄연히 전역변수 i는 지정된 지역변수 i와는 다른 것임을 이해해야한다.
	static int i;
	
	//메소드 a에 대하여, int i로써 지역변수 설정 시, 이 떄 i는 지역변수로써, 메소드 내부에서만 사용되기에 무한정 실행되는 코드가 아니게 된다.
	static void a() {
		i = 0;
	}
	
	public static void main(String[] args) {
		
		//for(int i = 0; i < 5; i++) 라는 for문을 사용시 , 무한정 실행되는 코드가 아니게 된다.

		for(i = 0; i < 5; i++)
		{
			a();
			System.out.println(i);
		}

	}

}
