import java.util.Scanner;

public class switch���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");
		int rank = sc.nextInt();
		
		switch (rank) {
		case 1 :
			System.out.println("�ϵ��Դϴ�.");
			break;
		case 2 :
			System.out.println("�̵��Դϴ�.");
			break;
		case 3 :
			System.out.println("����Դϴ�.");
			break;
		default :
			System.out.println("����Դϴ�.");
			
		}
		sc.close();
	}

}
