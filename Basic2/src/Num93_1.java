import java.util.Scanner;

public class Num93_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		Scanner scan = new Scanner(System.in);
		
		String[] arr = scan.nextLine().split(" ");
		
		int[] classmate = new int[23];
		
		for(int i = 0; i < a; i++ )
		{
			classmate[Integer.parseInt(arr[i]) - 1] += 1;
		}
		
		for(int i = 0; i < classmate.length; i++)
		{
			System.out.print(classmate[i] + " ");
		}
		sc.close();
		scan.close();

	}

}
