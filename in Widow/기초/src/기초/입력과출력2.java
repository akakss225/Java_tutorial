package 기초;

import java.util.Scanner;

public class 입력과출력2 {

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
				System.out.println("'"+sc.next() + "'" + "는 정수형이 아니므로 계산을 실행할 수 없습니다.");
			}
		}

		
	}

}
