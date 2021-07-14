import java.util.Scanner;

public class Num30 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String oct = Integer.toOctalString(num);
		
		System.out.print(oct);

	
	}

}
