import java.util.Scanner;
import java.util.StringTokenizer;

public class Num42 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		int[] arr = new int[2];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		if(arr[1] != 0)
		{
			System.out.println(arr[0]%arr[1]);
		}

	}

}
