import java.util.Scanner;
import java.util.StringTokenizer;

public class Num48 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		String[] arr= new String[2];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			i += 1;
		}
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		if(a > b)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}

	}

}
