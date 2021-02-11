
public class 사용자정의함수3 {
	
	public static char function(String input) {
		return input.charAt(input.length() -1);
	}

	public static void main(String[] args) {

		System.out.println("Hello world의 마지막 단어는" + function("Hello world") + "입니다.");

	}

}
