
public class Main2 {
	
	public static int factorial(int number) {
		if(number == 0)
			return 1;
		else
			return number * factorial(number - 1);
	}
	
	public static void main(String[] args) {

		System.out.println("10!�� " + factorial(10) + "�Դϴ�.");

	}

}
