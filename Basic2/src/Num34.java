import java.util.Scanner;

public class Num34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num  = sc.nextLine();
		
		int hex = Integer.parseInt(num, 16);
		
		System.out.println(Integer.toOctalString(hex));

	}

}
