import java.util.Scanner;
import java.util.StringTokenizer;

public class Num86 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(a);
		
		String[] arr = new String[3];
		
		int i = 0;
		
		while(st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i += 1;
		}
		
		int w = Integer.parseInt(arr[0]);
		int h = Integer.parseInt(arr[1]);
		int b = Integer.parseInt(arr[2]);
		
		double B = (w * h * b) / 8;
		double KB = B / 1024;
		double MB = KB / 1024;
		double GB = MB / 1024;
		
		System.out.printf("%.2f MB", MB);

	}

}
