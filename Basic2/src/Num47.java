import java.util.Scanner;
import java.util.StringTokenizer;

public class Num47 {

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
		
		if(0 <= arr[0] && arr[0] <= 10 && 0 <= arr[1] && arr[1] <= 10)
		{
			System.out.println((int)(arr[0] * Math.pow(2, arr[1])));
		}

	}

}
