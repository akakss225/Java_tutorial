import java.util.Scanner;
import java.util.StringTokenizer;

public class Num65 {

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

		if(x % 2 == 0)
		{
			System.out.println(x);
		}
		if(y % 2 == 0)
		{
			System.out.println(y);
		}
		if(z % 2 == 0)
		{
			System.out.println(z);
		}
		
	}

}