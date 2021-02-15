import java.util.Scanner;
import java.util.StringTokenizer;

public class Num17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(a,":");
		
		int[] arr = new int[2];
		
		int i = 0;
		
		while(token.hasMoreTokens()) {
			arr[i] = Integer.parseInt(token.nextToken());
			i += 1;
		}
		
		String hour = String.format("%d", arr[0]);
		String min = String.format("%d", arr[1]);
		
		System.out.print(hour + ":" + min);
		
		sc.close();
		

	}

}
