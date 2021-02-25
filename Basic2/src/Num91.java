import java.util.Scanner;
import java.util.StringTokenizer;

public class Num91 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		String[] arr = new String[4];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			i += 1;
		}
		
		long a = Integer.parseInt(arr[0]);
		long m = Integer.parseInt(arr[1]);
		long d = Integer.parseInt(arr[2]);
		long n = Integer.parseInt(arr[3]);
		
		
		for(int j = 1; j < n; j++)
		{
			a = (a * m) + d;
		}
		System.out.println(a);
		
	}

}
