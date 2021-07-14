import java.util.Scanner;
import java.util.StringTokenizer;

public class Num84 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		String[] arr = new String[3];
		
		int q = 0;
		int a = 0;
		while(st.hasMoreTokens())
		{
			arr[a] = st.nextToken();
			a += 1;
		}
		
		int r = Integer.parseInt(arr[0]);
		int g = Integer.parseInt(arr[1]);
		int b = Integer.parseInt(arr[2]);

		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < g; j++)
			{
				for(int k = 0; k < b; k++)
				{
					System.out.printf("%d %d %d\n",i,j,k);
					q++;
				}
	
			}
		}
		System.out.println(q);
	}

}
