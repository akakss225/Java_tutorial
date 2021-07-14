
public class Main {

	final static int N = 30;
	final static int A = 15;
	
	
	public static void main(String[] args) {

		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("B+입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("C+입니다.");
		}
		else
		{
			System.out.println("F입니다.");
			
		}
		
		String a = "Man";
		int b = 0;
		
		// 자바는 String을 비교할 때 equal()을 이용합니다.
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		if(a.equals("Man"))
		{
			System.out.println("남자입니다.");
		}
		else
		{
			System.out.println("남자가 아닙니다.");
		}
		if(b == 3)
		{
			System.out.println("3입니다.");
		}
		else
		{
			System.out.println("3이 아닙니다.");
		}
		if(a.equalsIgnoreCase("man")) 
		{
			System.out.println("참입니다.");
			
		}
		else
		{
			System.out.println("거짓입니다.");
			
		}
		int c = 1, sum = 0;
		while(c <=1000)
		{
			sum += c++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");
		
		// for문 : 초기화부분, 조건 부분, 연산 부분
		for(int x = N; x > 0; x--)
		{
			for(int y = x; y > 0; y--)
			{
			System.out.print("★");
		}
		System.out.println();
		}
		// q^2 + p^2 = r^2
		for(int i = -A; i <= A; i++)
		{
			for(int j = -A; j <= A; j++)
			{
				if(i * i + j * j <= A * A )
				{
					System.out.print("○");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
