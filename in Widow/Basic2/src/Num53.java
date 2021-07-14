import java.util.Scanner;

public class Num53 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num == 1)
		{
			System.out.println(0);
		}
		else if(num == 0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println("1 또는 0만을 입력해 주세요");
		}
		


	}

}
