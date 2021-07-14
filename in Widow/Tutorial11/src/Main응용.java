
public class Main응용 {
	
	public static int function(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("3부터 1까지의 합은 " + function(3) + "입니다.");

	}

}
