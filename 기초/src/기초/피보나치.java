package ����;

public class �Ǻ���ġ {

	//a�� ����number, b�� �Ǻ���ġ ������ �ڸ���.
	public static int fibonacci(int A) {
		int a = 1;
		int b = 1;
		int result = 0;
		
		if(A == 0)
		{
			return -1;
		}
		else if(A == 1)
		{
			return a;
		}
		else if(A == 2)
		{
			return b;
		}
		else
		{
			for(int i = 2; i < A; i++)
			{
				result = a + b;
				a = b;
				b = result;
				
			}
		}
		return result;
}
	
	public static void main(String[] args) {

		System.out.println(fibonacci(10));

	}

}
