import java.util.Scanner;

public class ������� {

	//������ �ʿ��� �� �̼������� 140�̸�, ���� ���������� 70, ����� �Ϲ� ������ ����30 �Ǵ� ���� 80�̻��̾�� �Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̼� ���� : ");
		
		int a = sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		System.out.print("���� �̼� ���� : ");
		
		int b = sca.nextInt();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�Ϲ� �̼� ���� : ");
		
		int c = scan.nextInt();
		
		if(a >= 70 && a + b + c >= 140 && b >= 30 && c >= 30)
		{
			System.out.print("���� ����");
		}
		else if(a >= 70 && a + b + c >= 140 && b + c >= 80)
		{
			System.out.print("���� ����");
		}
		else
		{
			System.out.print("���� �Ұ���");
		}
		
		sc.close();
		sca.close();
		scan.close();
	}

}
