package ������Ʈ;

class Calculator{
	int left, right;
	
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Object2 {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		c.set(10, 20);
		
		//�׳� �Ű������� c�� �Է��ϴ°Ͱ� toString�� ���� ��°��� ��Ÿ����.
		//��, ������Ʈ Ŭ������ toString�� ������ �� ����������, �� ����� �����Ѵ�.
		//���⼭ toString�� ���Ͽ�, ����ڰ� �������̵��� ���� ���ϴ� ������Ʈ�� ���� �� �� �ִ�.
		
		System.out.println(c.toString());

	}

}
