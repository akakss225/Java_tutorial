
public class 제어문과메서드5 {

	// 피타고라스의 정의 : a^2 + b^2 = c^2
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++)
		{
			for(int j = 1; j <= 20; j++)
			{
				for(int k = 1; k <= 20; k++)
				{
					if(i * i + j * j == k * k && (i + j + k) <= 20)
						System.out.printf("가능한 삼각형의 각 변은 %d, %d, %d 이다.\n" , i, j, k);
				}
			}
		}
		
		

	}

}
