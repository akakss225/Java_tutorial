import java.util.Scanner;

public class Main2�ݺ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �������ּ��� : ");
		int num = sc.nextInt();

		int[] array = new int[num];
		int sum = 0;
		
		for(int i = 0; i < num; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1);
			sum += array[i];
		}
		System.out.println(num + "���� �迭�� �������� ���õ� 1~100�� ���� ��հ���" + sum / num + "�Դϴ�."); 
sc.close();
	}

}
