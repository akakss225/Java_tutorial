
public class 原硯乞 {
	final static int N = 10;

	public static void main(String[] args) {

		for(int i = N; i >= 0; i--)
		{	
			for(int j = 0; j <= N; j++)
			{
				if( j >= i )
				{
					System.out.print("で");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 1; i <= N; i++)
		{
			for(int j = 0; j <= N; j++)
			{
				if(j >= i)
				{
					System.out.print("ぬ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	    int A = 10;
		
		for(int a = A; a >= 0 ; a--)
		{
			for(int b = 0; b <= 10; b++)
			{
				if( b >= a)
				{
					System.out.print("で");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		int B = 10;
		
		for(int q = B; q >= 0; q--)
		{
			for(int p = B; p >= 0; p--)
			{
				if(p +1<= q)
				{
					System.out.print("ぬ");
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
