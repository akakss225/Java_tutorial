import java.util.Scanner;
import java.util.StringTokenizer;

public class Num13 {

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
		
		String first = String.format("%d", arr[0]);
		String second = String.format("%d", arr[1]);
		
		System.out.printf("%d %d",first,second);


	}

}
