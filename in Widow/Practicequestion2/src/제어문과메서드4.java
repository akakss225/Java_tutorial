import java.util.Scanner;

public class ������޼���4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� ������ �ּ��� : ");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < a; j++)
			{
				if(j <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
