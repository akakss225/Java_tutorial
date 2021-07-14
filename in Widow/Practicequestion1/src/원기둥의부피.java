import java.util.Scanner;

public class 원기둥의부피 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		
		Double a = sc.nextDouble();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원기둥의 높이는? " );
		
		Double b = scan.nextDouble();
		
		double pi = 3.14;
		//원기둥의 부피는 반지름의 제곱 * pi * 원기둥의 높이이다.
		System.out.print("원기둥의 부피는 " + pi*a*a*b );
		
		sc.close();
		scan.close();
		
		

	}

}
