package ����;

public class ���丮�� {
	
	public static int factorial(int x) {
		int a = 1;
		for(int i = x; i > 0; i--)
		{
			a *= i;
		}
		return a;
	}

	public static void main(String[] args) {

		System.out.println(factorial(6));

	}

}
