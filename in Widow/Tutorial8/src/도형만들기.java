
public class 도형만들기 {

	final static int N = 5;
	
	public static void main(String[] args) {
		
		// x^2 + y^2 = r^2
		for(int x = -N; x <= N; x++)
		{
			for(int y = -N; y <= N; y++)
			{
				if(x * x + y * y <= N * N)
				{
					System.out.print(" ");
				}
				else
					System.out.print("o");
			}
			System.out.println();
		}
		for(int x = -N; x <= N; x++)
		{
			for(int y = -N; y <= N; y++)
			{
				if(x * x + y * y <= N * N)
				{
					System.out.print("o");
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



