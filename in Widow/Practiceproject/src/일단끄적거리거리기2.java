
public class 일단끄적거리거리기2 {
	
	public static int sum(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++)
			sum += i;
		
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("합(1~10) : " + sum(1, 10));
		System.out.println("합(10~100) : " + sum(10, 100));
		System.out.println("합(100~1000) : " + sum(100, 1000));

	}

}
