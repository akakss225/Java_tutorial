import java.util.Scanner;

public class Num24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		
		
		
		
		for(int i = 0; i < num.length(); i++)
		{
			int a = (int)Math.pow(10, (num.length() - i - 1));
			int b = (num.charAt(i) - '0' )* a;
			System.out.println("[" +  b   + "]");
		}

	}

}
