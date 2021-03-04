class B{
	private int[] arr = new int[3];
	B() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void x(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
			
		// finally는 문법적으로 무조건 try catch문에서만 사용할 수 있다.
		}finally {
			System.out.println("finally");
		}
	}
}


public class 예외4 {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.x(10, 0);
		b.x(1, 0);
		b.x(2, 1);
		
		
		

	}

}
