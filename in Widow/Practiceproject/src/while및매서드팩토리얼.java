import java.util.Scanner;

public class while�׸ż������丮�� {
	
	public static int factorial(int x) {
		
		int r = 1;
		int a = 1;
		while(a <= x)
		{
			r *= a;
			a++;

		}
		return r;
		
		
		
	}

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		System.out.print("���丮�� ���� ���� ���� : ");
		
		int n = factorial(in.nextInt());
		
		System.out.println(n);
		
		in.close();

	}
	

}
