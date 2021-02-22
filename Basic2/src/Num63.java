import java.util.Scanner;
import java.util.StringTokenizer;

public class Num63 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(a);
		
		int[] arr = new int[2];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		System.out.println(arr[0] > arr[1] ? arr[0] : arr[1]);

	}

}
