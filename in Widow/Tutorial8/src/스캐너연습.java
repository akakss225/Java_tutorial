import java.util.Scanner;

public class 스캐너연습 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("첫번째 실수 입력 : ");
	    
	    double j = scan.nextDouble();
	    
	    Scanner sscan = new Scanner(System.in);
	    System.out.print("두번째 실수 입력 : ");
	    		
	    double p = sscan.nextDouble();
	    
	    double A = Math.pow(j, p);
	    
	    System.out.print("첫번째 입력된 실수의 두번째 실수만큼의 거듭제곱의 값은 " +(int) A + "입니다.");
	    scan.close();
	    		
		scan.close();
		sscan.close();

	}

}
