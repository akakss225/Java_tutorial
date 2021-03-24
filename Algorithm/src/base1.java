
public class base1 {

	public static void main(String[] args) {
		
		// 가장 기초적인 알고리즘 : 정렬
		int[] arr = {1,10,5,6,4,3,8,7,9,2};
		
		int min = 999;
		int index = 0 ;
		int temp ;
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if(min > arr[j])
				{
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;	
		}
		for(int i = 0; i < 10; i ++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
