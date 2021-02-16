import java.util.Scanner;

public class Num31 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String hex = Integer.toHexString(num);
		
		System.out.print(hex);

	
	}

}
