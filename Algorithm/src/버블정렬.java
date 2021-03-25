
public class 버블정렬 {

	public static void main(String[] args) {

		int[] arr = {1,10,5,6,4,3,8,7,9,2};
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 9 - i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp;
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < 10 ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
