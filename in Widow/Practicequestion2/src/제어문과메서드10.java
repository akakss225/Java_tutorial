import java.util.Scanner;

public class ������޼���10 {
	
	public static boolean isPrime(int a) {
		if(a <= 1)
			return false;
		
		for(int i = 2; i < a; i++)
		{
			if(a % i == 0)
				return false;
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(isPrime(num))
			System.out.println(num + "��(��) �Ҽ��Դϴ�.");
		else
			System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
		sc.close();
	}

}
