import java.util.Scanner;

public class ��ĳ�ʿ��Ƕ�̵� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please write a line nmuber : ");
		
		int a = sc.nextInt();
		
		for(int i = a; i >= 0; i--)
		{
			for(int j = 0; j <= a; j++)
			{
				if(j >= i)
					System.out.print("��");
				else
					System.out.print(" ");
			}
			System.out.println();
			sc.close();
		}
		}
	
	}


