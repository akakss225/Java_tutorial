/* try {
 *    예외의 발생이 예상되는 로직
 * }catch(예외클래스 인스턴스){
 *    예외가 발생했을 때 실행되는 로직
 * }  
 */


class Cal{
	int left,right;
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void devide() {
		/* try catch문은 예외를 출력하는 가장 기본적인 문법이다.
		 * 이는 try catch문 내부에 오류를 발생시킬 수 있는 코드들이 존재 할 때,
		 * 이 오류를 벗어나게 해주는 역할을 수행한다.
		 */
		try {
			//첫번째 문장은 출력이 됨을 볼 수 있음.
		System.out.print("계산결과는 ");
		//두번째 값이 출력되지 않음을 볼 수 있다. 즉, 여기서 오류가 생겼음을 알 수 있다.
		System.out.print(this.left/this.right);
		System.out.print("입니다.");
		}catch(Exception e) {
			//오류가 발생했습니다./ by zero
			//일종의 뒷수습
			System.out.println("오류가 발생했습니다." + e.getMessage());
		}
	}
}

public class 예외1 {

	public static void main(String[] args) {
		
		Cal c = new Cal();
		//여기서 분모에 0이라는 값을 넣음으로, 오류를 확인할 수 있다.
		c.set(10, 0);
		c.devide();

		

	}

}
