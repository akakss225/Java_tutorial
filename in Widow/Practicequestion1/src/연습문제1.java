
public class 연습문제1 {

	public static void main(String[] args) {

		
		int num = 5;
		
		for(int i = 0; i < num; i++)
		{
			for(int j = 1; j < num - i; j++)
			{
				System.out.print("  ");
			}
			for(int k = 0; k < 2 * i + 1; k++)
			{
				System.out.print("ㅗ");
			}
			System.out.println();
		}
		
	}

}
