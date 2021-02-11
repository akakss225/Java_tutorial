import java.util.Scanner;

public class 한번더while및매서드 {

	public static void main(String[] args) {

		int result = 1;   //팩토리얼 결과 값 저장
		   //키보드에서 입력받을 정수 저장
		
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼을 구하고자하는 정수를 입력해주세요 : ");
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
