package ����;

class A{
	public int id;
	A(int id){
		this.id = id;
	}
}

public class Reference2 {
	
	public static void runValue() {
		int a = 1;
		int b = a; // ������ a�� ���� b�� ���� �ȴ�. ��, a�� �⺻���� b�� ���� ������ ���̴�.
		b = 2; 
		System.out.println("runValue, " + a);
	}
	public static void runReference() {
		A a = new A(1); // ���⼭ ���� a�� Ŭ���� A�� �ν��Ͻ��� ��ġ�ϴ� ��ġ������ ������ �������ִ�.
		A b = a; //�⺻ ������Ÿ���� ����ִ� a�� b�� ������, b���ο��� 1 �̶�� ���� ������ �ȴ�.
		// ���⼭ �ٸ����� ���� b���� �ν��Ͻ�a�� �����Ǿ� ���ε��°� �ƴ�, ���� a�� ����Ű���ִ� �ν��Ͻ� A������ �ּҰ��� ���´�.
		b.id = 2; //���� ���⼭ b.id = 2 ��� ���� �ｼ Ŭ���� A�� �̿��� ���� �ν��Ͻ��� ���� ������ 2 �� �����Ŵ�� ���Ѵ�.
		System.out.println("runReference, " + a.id);
	}

	public static void main(String[] args) {

		runValue();
		runReference(); //�ּҸ� �����ϱ� ������, �ּҿ� ��� �� ��ü�� ����. ���� a�� 2�� �����.
		//�̴� �⺻ ������Ÿ���� ���� �� �ִ� ������ ��� ����, new�� ���� ������� ������ Ÿ���� ����ϴ� ������ ��� ���� �ٸ��� �� �� �ִ�.
	}

}
