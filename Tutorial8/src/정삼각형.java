
public class ���ﰢ�� {
	final static int N = 10;

	public static void main(String[] args) {
		
		for(int i = 0; i <= N; i++)
		{
			for(int j = N; j >= 0; j--)
			{
				if(i >= j)
				{
					System.out.print("��");
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


