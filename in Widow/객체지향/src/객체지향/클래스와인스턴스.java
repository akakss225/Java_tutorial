package ��ü����;

//Ŭ������ ������ ���赵(����)�̰�, �ν��Ͻ��� ��ǰ(ȣ��)�̶�� �� �� �ִ�.

public class Ŭ�������ν��Ͻ� {
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void average(int i , int j) {
		System.out.println((i + j)/2);
	}

	public static void main(String[] args) {
		
		//���α׷����� ���� �⺻�� �ߺ��� �����̴�. << �������� �� �������� �ſ� ������ ������ ��ħ.
		
		System.out.println(10 + 20);
		System.out.println(20 + 40);
		
		sum(10,20);
		sum(20,40);
		
		
		int left, right;
		
		left = 10;
		right = 20;
		
		sum(left, right);
		average(left, right);
		
		left = 20;
		right = 40;
		
		sum(left, right);
		average(left, right);

	}

}
