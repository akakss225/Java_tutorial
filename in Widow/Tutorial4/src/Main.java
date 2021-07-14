
public class Main {

	final static int SECOND = 1000;
	
	
	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분" + second + "초");
		
		int a = 10;
		
		System.out.println("현재의 a는 " + a + "입니다.");
		a++;
		System.out.println("현재의 a는 " + a + "입니다.");
		System.out.println("현재의 a는 " + ++a + "입니다.");
		System.out.println("현재의 a는 " + a++ + "입니다.");
		System.out.println("현재의 a는 " + a + "입니다.");
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int b = 50;
		int c = 50;
		

		System.out.println("b와 c가 같은가요? " + (b == c));
		System.out.println("b와 c가 큰가요? " + (b > c));
		System.out.println("b와 c가 작은가요? " + (b < c));
		System.out.println("b와 c가 같으면서 b가 30보다 큰가요? " + ((b == c) && (b > 30)));
		System.out.println("b가 50이 아닌가요?" + !(b == 50));
		
		
		
	}

}
