import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		int a = sc.nextInt();
		
		if(a % 4 == 0)
		{
			System.out.print("true");
		}
		else if(a % 5 == 0)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
		
		sc.close();

	}

}
