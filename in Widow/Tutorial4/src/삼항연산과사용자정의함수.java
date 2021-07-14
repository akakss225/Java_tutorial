
public class 삼항연산과사용자정의함수 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {

		System.out.println("최댓값은 " + max(60, 80) + "입니다.");

	}

}
