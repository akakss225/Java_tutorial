import java.util.Scanner;
import java.util.StringTokenizer;

public class Num25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String time = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(time,":");
		
		int[] arr = new int[3];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		String h = String.format("%d", arr[0]);
		String m = String.format("%d", arr[1]);
		String s = String.format("%d", arr[2]);
		
		System.out.print(m);

		

	}

}
