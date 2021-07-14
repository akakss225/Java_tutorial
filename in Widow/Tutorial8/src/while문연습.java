
public class while문연습 {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;
		while(i <= 200)
		{
			sum += i++;
		}
		System.out.println("1부터 200까지의 합은 " + sum + "입니다.");
		
		
		int j = 0;
		int ssum = 0;
		while(j <= 121)
		{
			ssum += j++;
			
		}
		System.out.println("1부터 121까지의 합은 " + ssum + "입니다.");
		

	}

}
