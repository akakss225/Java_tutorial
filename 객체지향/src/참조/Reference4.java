package ����;

public class Reference4 {
	
	static void _value(int b) {
		b = 2;
	}
	static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}
	
	
	static void _reference1(A b) {
		b = new A(2);
	}
	static void runReference1() {
		A a = new A(1);
		_reference1(a);
		System.out.println("runReference1, " + a.id);
	}
	//�ᱹ  A�� �����ϴ� a�� ��� 1 �� ����ְ�, ������ A�� �����ϴ� b�� ��� 2�� ��°��� �ǹ��Ѵ�. 
	//��, �ٸ� �ּҸ� ����ϱ� ������ a�� ����ϸ� 1 �� ���´�.
	
	
	static void _reference2(A b) {
		b.id = 2;
		
	}
	static void runReference2() {
		A a = new A(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id);
	}
	/* ���⼭�� A�� �����ϴ� a�� ��� ,1�� ������, b.id = 2 ��� ���� �ް� �Ǹ�, 
	 * ���� A�� �����ϴ� b�� ���� �ٲ�� ������, ���� �ּҸ� ����Ͽ� �ٲ۰��̹Ƿ�, a�� ���� �ٲ�� �ȴ�.
	 */
			

	public static void main(String[] args) {

		runValue();
		runReference1();
		runReference2();

	}

}
