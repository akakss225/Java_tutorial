import java.util.Scanner;

public class 제어문과메서드3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		do {			
			System.out.print("양의 정수를 입력하세요 : ");
			int a = sc.nextInt();
			
			if(a <= 0)
				break;
			
			if(a % 2 == 0)
				sum += a;
			
			
		}while(true);
		
			System.out.print("입력한 양의 정수 중에서 짝수의 합은 " + sum);

sc.close();
}
}