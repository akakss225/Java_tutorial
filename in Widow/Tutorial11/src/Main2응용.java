
public class Main2응용 {
	
	public static int function(int number) {
		if(number == 1)
			return 1;
		else
			return number + function(number - 1);
	}

	public static void main(String[] args) {
		System.out.println("10부터 1까지의 합은" + function(10) + "입니다.");

	}

}
