import java.util.Scanner;

public class �ð�ȯ�� {
	
	//�ʸ� �Է��ϸ� �ð�, ��, �ʷ� ȯ���� ����ϴ� ���α׷�

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		
		int a = sc.nextInt();
		
		int hour = (int) (a / 3600);
		int min = (int) ((a / 60) % 60);
		int sec = (int) (a % 60);
		
		System.out.print(hour + "�ð� " + min + "�� " + sec + "��");
		sc.close();
		

	}

}
