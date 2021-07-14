package 기초;

public class 피보나치재귀 {
	
	public static int fibonacci(int x) {
		int result;
		
		if(x == 0)
		{
			return -1;
		}
		else if(x == 1)
		{
			return 1;
		}
		else if(x == 2)
		{
			return 1;
		}
		else
		{
			result = fibonacci(x - 1) + fibonacci(x - 2);
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(fibonacci(10));

	}

}
