package 객체지향;

//클래스는 일종의 설계도(정의)이고, 인스턴스는 제품(호출)이라고 할 수 있다.

public class 클래스와인스턴스 {
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void average(int i , int j) {
		System.out.println((i + j)/2);
	}

	public static void main(String[] args) {
		
		//프로그래밍의 가장 기본은 중복의 제거이다. << 유지보수 및 가독성에 매우 지대한 영향을 미침.
		
		System.out.println(10 + 20);
		System.out.println(20 + 40);
		
		sum(10,20);
		sum(20,40);
		
		
		int left, right;
		
		left = 10;
		right = 20;
		
		sum(left, right);
		average(left, right);
		
		left = 20;
		right = 40;
		
		sum(left, right);
		average(left, right);

	}

}
