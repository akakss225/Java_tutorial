import java.util.Scanner;

public class 화씨온도섭씨온도 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("화씨온도(F)를 입력하세요 : ");
		
		double a = sc.nextDouble();
		
		System.out.print(a + "F에 대한 섭씨온도(C)는 " + (double)(5/9 + 5%9)*(a-32) + "C 입니다." );
		sc.close();

	}

}
