
public class 버블정렬 {

	public static void main(String[] args) {

		// 알고리즘을 이용한 오름차순 정렬
		
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
		// 버블정렬은 앞서 배운 선태정렬보다 코드는 훨씬 간결하다.
		// 하지만 선택정렬보다도 그 효율성은 낮다.
		// 선택정렬과 마찬가지로 반복을 진핼할 때마다 1번씩 줄어든다.
		// 빅오표기법으로도 O(N^2)이지만, 선택정렬보다 수행시간이 오래걸리는데
		// 그 이유는 매 작업순간마다 자리를 바꿔주는 실행을 하기때문에, 더 오래걸린다.
		// 정렬중 가장 느린 정렬방법이다.
	}

}
