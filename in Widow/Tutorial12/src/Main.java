
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

		System.out.println("�Ǻ���ġ ������ 10��° ���Ҵ� " + fibonacci(10) + "�Դϴ�.");

	}

}
