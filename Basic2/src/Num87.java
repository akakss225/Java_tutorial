import java.util.Scanner;

public class Num87 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		
		int sum = 0;
		
		for(int i = 0; i <= a; i++ )
		{
			sum += i;
			if(sum >= a)
			{
				System.out.println(sum);
				break;
			}
		}

	}

}
