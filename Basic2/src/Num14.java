import java.util.Scanner;
import java.util.StringTokenizer;

public class Num14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(a," ");
		
		int[] b = new int[2];
		int i = 0;
		
		while(token.hasMoreTokens())
		{
			b[i] = Integer.parseInt(token.nextToken());
            i+=1;
		}
		
		String x = String.format("%d", b[0]);
		String y = String.format("%d", b[1]);
		
		System.out.print(x +" " + y);

		sc.close();
	}

}
