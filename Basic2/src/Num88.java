import java.util.Scanner;

public class Num88 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i ++)
		{
			if(i % 3 == 0)
			{
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
