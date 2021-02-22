import java.util.Scanner;
import java.util.StringTokenizer;

public class Num64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(a);
		
		String[] arr = new String[3];
		
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			i += 1;
		}
		
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int z = Integer.parseInt(arr[2]);

		System.out.println((x > z ? z : x) > y ? y : (x > z ? z : x) );
		
	}

}
