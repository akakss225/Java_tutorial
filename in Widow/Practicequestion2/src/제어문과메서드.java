import java.util.Scanner;

public class ������޼��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� : ");
		
		int in = sc.nextInt();
		
		if(in >= 19)
			System.out.print("����");
		else
			System.out.print("�̼���");
		
		sc.close();
	}
	

}
