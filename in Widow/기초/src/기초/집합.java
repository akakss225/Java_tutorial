package 기초;

public class 집합 {

	public static void main(String[] args) {

		int[] s1 = new int[5];
		int[] s2 = new int[5];
		
		for(int i = 0; i < s1.length; i++)
		{
			s1[i] = i + 1;
			System.out.print(s1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < s2.length; i++)
		{
			s2[i] = i + 3;
			System.out.print(s2[i] + " ");
		}
		System.out.println();
		
		
		
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(s1[i] == s2[j])
				{
					System.out.print(s1[i] + " " );
				}
			
			}
		}
		
		
		
		

	}

}
