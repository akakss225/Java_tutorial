import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;
		for(;;)
		{
			System.out.println("���");
			count++;
			if(count == 5)
			{
				break;
			}
		}
		
		Scanner sc = new Scanner(System.in);
	System.out.print("������ �Է��ϼ��� : ");
	int i = sc.nextInt();
	System.out.println("�Էµ� ������ " + i + "�Դϴ�.");

		sc.close();
	}

}
