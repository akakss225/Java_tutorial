import java.util.Scanner;

public class Num78 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int x = 0;
		for(int i = 0; i <= a; i++)
		{
			if(i % 2 == 0)
			{				
				x += i;
			}
			
		}
		System.out.println(x);

	}

}
