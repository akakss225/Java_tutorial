package ����;

import java.util.Scanner;

public class �Է°����2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			if(sc.hasNextInt())
			{
				System.out.println(sc.nextInt()*1000);
			}
			else if(sc.hasNext())
			{
				System.out.println("'"+sc.next() + "'" + "�� �������� �ƴϹǷ� ����� ������ �� �����ϴ�.");
			}
		}

		
	}

}
