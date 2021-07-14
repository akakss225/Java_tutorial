//예제는 예외2번의 class 및 메소드를 따온다. class 이름은 Cal이다.
class Calculator{
	int left,right;
	public void set(int left, int right) {
		//illegalArgumentException 가능.
		
		/*if(right == 0) {
		*	throw new IllegalArgumentException("두번쨰 인자는 0을 허용하지 않습니다.");
		*}
		*/
		
		this.left = left;
		this.right = right;
	}
	public void devide() {
		//ArithmeticException 가능.
		
		if(right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		
		
		/*사실 계산기의 경우 첫번째 Exception보다는 두번째 Exception이 좋다.
		 * 왜냐하면 나누기를 제외한 사칙연산은 두번째 인자가 0일수 있기 때문이다.
		 */
		
		try {
		System.out.print("계산결과는 ");
		
		System.out.print(this.left/this.right);
		System.out.print("입니다.");
		}catch(Exception e) {
			System.out.println("\n\ne.getMessage\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStrackTrace()");
			e.printStackTrace();
		}
	}
}

public class 예외6 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.set(10, 0);
		try {
			c1.devide();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}


	}

}
