import java.util.Scanner;

public class ������޼���3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		do {			
			System.out.print("���� ������ �Է��ϼ��� : ");
			int a = sc.nextInt();
			
			if(a <= 0)
				break;
			
			if(a % 2 == 0)
				sum += a;
			
			
		}while(true);
		
			System.out.print("�Է��� ���� ���� �߿��� ¦���� ���� " + sum);

sc.close();
}
}