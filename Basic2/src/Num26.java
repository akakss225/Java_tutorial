import java.util.Scanner;
import java.util.StringTokenizer;

public class Num26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(date,".");
		
		int[] arr = new int[3];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		String y = String.format("%04d", arr[0]);
		String m = String.format("%02d", arr[1]);
		String d = String.format("%02d", arr[2]);
		
		System.out.print(m + "-" + d + "-" + y);
		sc.close();

	}

}
