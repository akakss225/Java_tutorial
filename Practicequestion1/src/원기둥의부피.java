import java.util.Scanner;

public class ������Ǻ��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������� �ظ� ��������? ");
		
		Double a = sc.nextDouble();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������� ���̴�? " );
		
		Double b = scan.nextDouble();
		
		double pi = 3.14;
		//������� ���Ǵ� �������� ���� * pi * ������� �����̴�.
		System.out.print("������� ���Ǵ� " + pi*a*a*b );
		
		sc.close();
		scan.close();
		
		

	}

}
