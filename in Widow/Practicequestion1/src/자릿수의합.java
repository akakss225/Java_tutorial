import java.util.Scanner;

public class �ڸ������� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		
		int a = sc.nextInt();
		
		System.out.print("�� �ڸ����� �� = " + ((a/100) + ((a%100)/10) + (a%10)));
		sc.close();

	}

}
