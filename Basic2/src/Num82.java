import java.util.Scanner;

public class Num82 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		

		int hex = Integer.valueOf(x, 16);
		
		
		
		
		for(int i = 1; i <= 15; i++ )
		{
			String a = Integer.toHexString(i);
			int z = Integer.valueOf(a, 16);
			
			System.out.printf("%X*%X=%X\n",hex,z,hex*z);
		}

	}

}
