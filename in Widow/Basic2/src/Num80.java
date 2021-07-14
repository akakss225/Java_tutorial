import java.util.Scanner;

public class Num80 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int x = 0;
		
		for(int i = 1; i < a; i++)
		{
			x += i;
			if(x >= a)
			{
				System.out.println(i);break;
			}
		}
		
		
		

	}

}
