
public class Á¤»ï°¢Çü {
	final static int N = 10;

	public static void main(String[] args) {
		
		for(int i = 0; i <= N; i++)
		{
			for(int j = N; j >= 0; j--)
			{
				if(i >= j)
				{
					System.out.print("¤Ç");
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


