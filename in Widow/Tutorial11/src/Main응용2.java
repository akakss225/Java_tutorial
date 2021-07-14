
public class Main응용2 {
	public static int combine(int a, int b) {
		//combine함수는 조합을 의미한다. 
		int sum1 = 1;
		int sum2 = 1;
		int sum3 = 1;
		for(int i = a; i >= 1; i--)
		{
			sum1 *= i;
		}
		for(int j = b; j >= 1; j--)
		{
			sum2 *= j;
		}
		for(int k = a - b; k >= 1; k--)
		{
			sum3 *= k;
		}
		return sum1/(sum2*sum3);
	}

	public static void main(String[] args) {

		System.out.println(combine(7, 3));

	}

}
