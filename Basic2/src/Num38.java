import java.util.Scanner;
import java.util.StringTokenizer;

public class Num38 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		String[] arr = new String[2];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			i += 1;
		}
		
		long a = Long.parseLong(arr[0]);
		long b = Long.parseLong(arr[1]);
		
		System.out.println(a + b);

	}

}
