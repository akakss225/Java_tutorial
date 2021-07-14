import java.util.Scanner;

public class Num96 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[20][20];
		
		int a = sc.nextInt();	
		
		int x,y;
		
		for(int i = 0; i < a; i++)
		{
			x = sc.nextInt();
			y = sc.nextInt();
			
			arr[x-1][y-1] = 1;
		}
		
		for(int k = 0; k < 19; k++ )
		{
			for(int l = 0; l < 19; l++)
			{
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();
		}
		

		

	}

}
