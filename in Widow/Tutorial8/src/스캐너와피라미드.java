import java.util.Scanner;

public class 스캐너와피라미드 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please write a line nmuber : ");
		
		int a = sc.nextInt();
		
		for(int i = a; i >= 0; i--)
		{
			for(int j = 0; j <= a; j++)
			{
				if(j >= i)
					System.out.print("ㅁ");
				else
					System.out.print(" ");
			}
			System.out.println();
			sc.close();
		}
		}
	
	}


