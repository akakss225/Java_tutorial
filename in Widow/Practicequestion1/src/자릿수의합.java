import java.util.Scanner;

public class 자릿수의합 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		System.out.print("각 자릿수의 합 = " + ((a/100) + ((a%100)/10) + (a%10)));
		sc.close();

	}

}
