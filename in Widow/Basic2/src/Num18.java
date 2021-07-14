import java.util.Scanner;
import java.util.StringTokenizer;

public class Num18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(date,".");
		
		int[] array = new int[3];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			array[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}
		
		String y = String.format("%04d", array[0]);
		String m = String.format("%02d", array[1]);
		String d = String.format("%02d", array[2]);
		
		
		System.out.print(y + "." + m +"."+ d);
		sc.close();

	}

}
