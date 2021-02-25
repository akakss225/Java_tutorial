import java.util.Scanner;
import java.util.StringTokenizer;

public class Num92 {

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
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		
		
		for(int j = 1; j <= a*b*c; j ++)
		{
			if(j % a == 0 && j % b == 0 && j % c == 0)
			{
				System.out.println(j);break;
			}
		}
		
	}

}
