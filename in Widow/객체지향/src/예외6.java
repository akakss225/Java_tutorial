//������ ����2���� class �� �޼ҵ带 ���´�. class �̸��� Cal�̴�.
class Calculator{
	int left,right;
	public void set(int left, int right) {
		//illegalArgumentException ����.
		
		/*if(right == 0) {
		*	throw new IllegalArgumentException("�ι��� ���ڴ� 0�� ������� �ʽ��ϴ�.");
		*}
		*/
		
		this.left = left;
		this.right = right;
	}
	public void devide() {
		//ArithmeticException ����.
		
		if(right == 0) {
			throw new ArithmeticException("0���� ���� �� �����ϴ�.");
		}
		
		
		/*��� ������ ��� ù��° Exception���ٴ� �ι�° Exception�� ����.
		 * �ֳ��ϸ� �����⸦ ������ ��Ģ������ �ι�° ���ڰ� 0�ϼ� �ֱ� �����̴�.
		 */
		
		try {
		System.out.print("������� ");
		
		System.out.print(this.left/this.right);
		System.out.print("�Դϴ�.");
		}catch(Exception e) {
			System.out.println("\n\ne.getMessage\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStrackTrace()");
			e.printStackTrace();
		}
	}
}

public class ����6 {

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
