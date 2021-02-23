import java.util.Scanner;
import java.util.StringTokenizer;

public class Num85 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sound = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(sound);
		
		String[] arr = new String[4];
		int i = 0;
		
		while(st.hasMoreTokens())
		{
			arr[i] = st.nextToken();
			i += 1;
		}
		
		int h = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int s = Integer.parseInt(arr[3]);
		
		double KB = ((h * b * c * s)/8)/1024;
		double MB = KB/1024;
		double GB = MB/1024;
		
		
		System.out.printf("%.1f MB",MB);
	}

}
