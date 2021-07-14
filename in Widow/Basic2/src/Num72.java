import java.util.Scanner;
import java.util.StringTokenizer;

public class Num72 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
						
		int[] arr = new int[a];
		
		Scanner ssc = new Scanner(System.in);
		
		String b = ssc.nextLine();
		
		StringTokenizer st = new StringTokenizer(b);
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
