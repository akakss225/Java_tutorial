import java.io.IOException;

/* 예외의 종류 
 * illegalArgumentException : 매개변수가 의도하지 않은 상황을 유발시킬 때
 * IllegalStateException : 메소드를 호출하기 위한 생타개 아닐 때
 * NullPointerException : 매개 변수 값이 null일 때
 * IndexOutOfBoundsException : 인덱스 매개 변수 값이 범위를 벗어날 때
 * ArithmeticException : 산술적인 연산에 오류가 있을 때
 */

class E{
	void thorwArithmeticException() {
		throw new ArithmeticException();
	}
	
	
	// 1. try catch로 잡기
	void throwIOException1() {
		try {
			throw new IOException();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	// 2. 사용자에게 던지기
	void throwIOException2() throws IOException {
		throw new IOException();
	}
}

public class 예외7 {

	public static void main(String[] args) {

		

	}

}
