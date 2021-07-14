import java.util.Scanner;

public class 자바교재문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		System.out.print(a + "의 제곱은 " + a * a);
		
		sc.close();

	}

}
