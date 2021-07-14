import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;
		for(;;)
		{
			System.out.println("출력");
			count++;
			if(count == 5)
			{
				break;
			}
		}
		
		Scanner sc = new Scanner(System.in);
	System.out.print("정수를 입력하세요 : ");
	int i = sc.nextInt();
	System.out.println("입력된 정수는 " + i + "입니다.");

		sc.close();
	}

}
