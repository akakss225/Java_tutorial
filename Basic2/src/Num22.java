import java.util.Scanner;
import java.util.StringTokenizer;

public class Num22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(num,".");
		
		int[] arr = new int[2];
		
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			System.out.println(arr[i]);
			i += 1;			
		}
		
		
		
		

	}

}
