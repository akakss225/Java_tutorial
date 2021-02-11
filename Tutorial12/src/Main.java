
public class Main {
	
	public static int fibonacci(int number) {
		int a = 1;
		int b = 1;
		int result = -1;
		if(number == 1)
			return a;
		else if(number == 2)
			return b;
		else
			for(int i = 2; i < number; i ++)
			{
				result = a + b;
				a = b;
				b = result;
			}
		return result;
			
	}

	public static void main(String[] args) {

		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");

	}

}
