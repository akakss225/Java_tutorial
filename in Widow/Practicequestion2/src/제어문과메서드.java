import java.util.Scanner;

public class 제어문과메서드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		
		int in = sc.nextInt();
		
		if(in >= 19)
			System.out.print("성년");
		else
			System.out.print("미성년");
		
		sc.close();
	}
	

}
