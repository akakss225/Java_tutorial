import java.util.Scanner;
import java.util.StringTokenizer;

public class Num14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(a);
		
		String[] b = new String[2];
		int i = 0;
		
		while(token.hasMoreTokens())
		{
			b[i] = token.nextToken();
            i+=1;
		}
		
		String x = String.format("%s", b[0]);
		String y = String.format("%s", b[1]);
		
		System.out.print(y +" " + x);

		sc.close();
	}

}
