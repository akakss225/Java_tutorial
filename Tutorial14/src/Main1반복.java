import java.util.Scanner;

public class Main1반복 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력해 주세요 : ");
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
