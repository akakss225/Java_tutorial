package ����;



public class Reference3 {
	
	public static void runValue() {
		int a = 1;
		int b = a; 
		b = 2; 
		System.out.println("runValue, " + a);
	}
	public static void runReference() {
		A a = new A(1); 
		A b = a;
		b = new A(2); //�̴� �ٸ� ���� �����ϱ� ������ �翬�� �ٸ� ���� ����Ѵ�.
		System.out.println("runReference, " + a.id);
	}

	public static void main(String[] args) {

		runValue();
		runReference();
		

	}

}
