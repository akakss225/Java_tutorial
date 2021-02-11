
public class 제어문과메서드8 {
	
	public static void printStar(int a) {
		for(int j = 1; j <= a; j++)
		{
			if(j <= a)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}		
	}

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			printStar(i);
			System.out.println();
		}		
	}
}
