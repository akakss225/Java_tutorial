import java.util.Scanner;

public class ȭ���µ������µ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ȭ���µ�(F)�� �Է��ϼ��� : ");
		
		double a = sc.nextDouble();
		
		System.out.print(a + "F�� ���� �����µ�(C)�� " + (double)(5/9 + 5%9)*(a-32) + "C �Դϴ�." );
		sc.close();

	}

}
