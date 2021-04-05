
public class base1 {

	public static void main(String[] args) {
		
		// 가장 기초적인 알고리즘 : 정렬
		// 선택정렬
		
		int[] arr = {1,10,5,6,4,3,8,7,9,2};
		
		
		for(int i = 0; i < 10; i++)
		{

			for(int j = i+1; j < 10; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < 10; i ++)
		{
			System.out.print(arr[i] + " ");
		}
		
		// 수행시간이 굉장히 오래걸림. N * ( N + 1 ) / 2 번 확인해야하기 때문.
		// N * N 의 수행시간이 걸린다고 표현함. 빅오(O) 표기법으로, O(N*N)이라고 표현함.
		// 보통 선택정렬의 경우 O(N^2) 수행시간이 걸린다.
		
		
		
		
		
	}

}
