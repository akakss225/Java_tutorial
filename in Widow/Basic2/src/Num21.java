import java.util.Scanner;
import java.util.StringTokenizer;

public class Num21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(a);
		
		String[] arr = new String[st.countTokens()];
		
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			System.out.print(arr[i] + " ");
			i += 1;
			
		}
		
		
		sc.close();
		

	}

}
