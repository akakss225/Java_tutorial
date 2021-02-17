import java.util.Scanner;
import java.util.StringTokenizer;


public class Num44 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num);
		
		double[] arr = new double[2];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		System.out.println((int)(arr[0] + arr[1]));
		System.out.println((int)(arr[0] - arr[1]));
		System.out.println((int)(arr[0] * arr[1]));
		System.out.println((int)(arr[0] / arr[1]));
		System.out.println((int)(arr[0] % arr[1]));
		System.out.printf("%.2f",(arr[0] / arr[1]));
		
		
	}

}
