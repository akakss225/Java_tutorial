import java.util.Scanner;

public class Main1�ݺ� {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͽ� �迭�� ũ�⸦ �����Ͻʽÿ� : ");
		int number = sc.nextInt();
		int[] array = new int[number];
		
		for(int i = 0; i < number; i++)
		{
			System.out.print("�迭�� ���õ� ������ �Է����ּ��� : ");
			array[i] = sc.nextInt();
			
		}
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
			System.out.print("���õ� �迭�� ������ ���� ū ���� : " + result + "�Դϴ�.");
 sc.close();
	}

}
