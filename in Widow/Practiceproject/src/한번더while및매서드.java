import java.util.Scanner;

public class �ѹ���while�׸ż��� {

	public static void main(String[] args) {

		int result = 1;   //���丮�� ��� �� ����
		   //Ű���忡�� �Է¹��� ���� ����
		
		Scanner in = new Scanner(System.in);
		System.out.print("���丮���� ���ϰ����ϴ� ������ �Է����ּ��� : ");
		int n = in.nextInt();
		
		for(int i = n; i > 1; i--)
		{
			if(n > 1)
			{
				result *= i;
			}
		}
		System.out.print(result);
in.close();
	}

}
