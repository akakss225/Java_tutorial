import java.util.Scanner;
import java.util.StringTokenizer;

public class Num81 {

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
		
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		for(int a = 1; a <= n; a++)
		{
			for(int j = 1; j <= m; j++)
			{
				System.out.println(a + " " + j);
			}
			
		}
		

	}

}
