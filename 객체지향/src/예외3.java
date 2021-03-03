class A{
	private int[] arr = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	//한가지 입력에서 두가지의 에러가 발생할 수 있음.
	public void z(int first, int second) {
		try {
		System.out.println(arr[first] / arr[second]);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException e");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");	
		}catch(Exception e) {
			
		}
	}
}


public class 예외3 {

	public static void main(String[] args) {

		A a = new A();
		
		a.z(10, 1);
		
		a.z(1, 0);
		
		a.z(2, 1);
		
		a.z(0, 1);

	}

}
