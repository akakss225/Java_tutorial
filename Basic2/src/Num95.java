import java.util.Scanner;

public class Num95 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		Scanner scan = new Scanner(System.in);
		
		String b = scan.nextLine();
		
		String[] arr = b.split(" ");
		
		int[] narr = new int[a];
		
		
		for(int j = 0; j < a; j++)
		{
			narr[j] = Integer.parseInt(arr[j]);
		}
		
		int mini = narr[0];
		
		for(int i = 0; i < a-1; i++)
		{
			
			if(narr[i] < mini)
			{				
				mini = narr[i];
			}
			
		}
		System.out.println(mini);

	}

}
