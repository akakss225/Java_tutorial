import java.util.Scanner;
import java.util.StringTokenizer;

public class Num19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String info = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(info,"-");
		
		int[] arr = new int[2];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		String first = String.format("%06d", arr[0]);
		String second = String.format("%07d", arr[1]);
		
		System.out.print(first + second);
		sc.close();
		

	}

}
