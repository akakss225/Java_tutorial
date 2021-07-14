import java.util.Scanner;

public class 제어문과메서드10 {
	
	public static boolean isPrime(int a) {
		if(a <= 1)
			return false;
		
		for(int i = 2; i < a; i++)
		{
			if(a % i == 0)
				return false;
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(isPrime(num))
			System.out.println(num + "는(은) 소수입니다.");
		else
			System.out.println(num + "는(은) 소수가 아닙니다.");
		sc.close();
	}

}
