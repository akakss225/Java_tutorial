import java.util.Scanner;

public class 연습문제1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please write a line number : ");
		int number = sc.nextInt();
		
		for(int i = number; i >= 0; i--)
		{
			for(int j = 0; j <= number; j++)
			{
				if(j >= i)
					System.out.print("ㅗ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			sc.close();
		}
		}
	

}
