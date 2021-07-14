import java.util.Scanner;
import java.util.StringTokenizer;

public class Num37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		long[] arr = new long[2];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		
		System.out.println(arr[0] + arr[1]);

	}

}
