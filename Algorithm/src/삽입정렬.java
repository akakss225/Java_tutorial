
public class 삽입정렬 {

	public static void main(String[] args) {

		// 앞선 두 정렬과 마찬가지로 O(N^2)의 시간복잡도를 갖는다.
		// 버블정렬과는 다르게 특정한 경우에서만 위치를 바꾼다.
		// 앞에있는 집합이 정렬이 되어있다고 가정하고 수행하기 때문에 특정 경우에서 굉장히 빠른 시간복잡도를 갖는다.
		
		int[] arr = {1,10,5,6,4,3,8,7,9,2};
		
		for(int i = 0; i < 10 ; i++)
		{
			int j,temp;
			temp = arr[i];
			j = i;
			while(j > 0 && temp < arr[j-1])
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		for(int i = 0; i < 10 ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
