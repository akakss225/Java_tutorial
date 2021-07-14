
public class ¿ª»ï°¢Çü {
	final static int N = 10;

	public static void main(String[] args) {

		for(int i = 0; i <= N; i++)
		{
			for(int j = 0; j <= N; j++)
			{
				if(j >= i)
				{
					System.out.print("¤Ì");
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
