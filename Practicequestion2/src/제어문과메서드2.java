import java.util.Scanner;

public class ������޼���2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է��� �ּ��� : ");
		
		int rank = sc.nextInt();
		
		switch(rank) {
		
		case 1:
			System.out.print("���� ���߽��ϴ�.");
			break;
		case 2:
			System.out.print("���߽��ϴ�.");
			break;
		case 3:
			System.out.print("���߽��ϴ�.");
			break;
		case 4:
			System.out.print("�����Դϴ�.");
			break;
		case 5:
			System.out.print("�����Դϴ�.");
			break;
		case 6:
			System.out.print("�����Դϴ�.");
			break;
		default :
			System.out.print("����ؾ߰ڽ��ϴ�.");
		}
		sc.close();

	}

}
