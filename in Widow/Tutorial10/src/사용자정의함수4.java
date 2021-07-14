
public class 사용자정의함수4 {

	public static int max(int a, int b) {
		return (a > b) ? a : b;
		
	}
	public static int function(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}
	public static void main(String[] args) {

		System.out.println("350, 700, 114중 가장 큰 수는 " + function(350, 700, 114) + "입니다.");

	}

}
