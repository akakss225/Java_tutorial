import java.util.Scanner;

public class Num94 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String b = sc2.nextLine();
		
		String[] arr = b.split(" ");
		
		for(int i = 0; i < a; i++)
		{
			System.out.print(arr[a - (i + 1)]+" ");
		}

	}	

}
