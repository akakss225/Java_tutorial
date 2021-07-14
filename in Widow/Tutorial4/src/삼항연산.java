
public class 삼항연산 {

	public static void main(String[] args) {

		int x = 50;
		int y = 60;
		
		System.out.println("최대값은 " + max(x,y) + "입니다.");

	}
	
	// 반환형, 함수 이름, 매개 변수
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
	
}
