import java.util.Scanner;
import java.util.StringTokenizer;

public class Num89 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		String[] arr = new String[3];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			i += 1;
		}
		
		int a = Integer.parseInt(arr[0]);
		int d = Integer.parseInt(arr[1]);
		int n = Integer.parseInt(arr[2]);
		
		for(int j = 1; j < n; j++)
		{
			a += d;
		}
		System.out.println(a);
		
	}

}
