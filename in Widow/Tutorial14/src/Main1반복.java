import java.util.Scanner;

public class Main1�ݺ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		int[][] array = new int[num][num];
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num; j++)
			{
				array[i][j] = (int) (Math.random() * 10);
			}
		}
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
sc.close();
	}

}
