
public class �������� {

	public static void main(String[] args) {

		// �ռ� �� ���İ� ���������� O(N^2)�� �ð����⵵�� ���´�.
		// �������İ��� �ٸ��� Ư���� ��쿡���� ��ġ�� �ٲ۴�.
		// �տ��ִ� ������ ������ �Ǿ��ִٰ� �����ϰ� �����ϱ� ������ Ư�� ��쿡�� ������ ���� �ð����⵵�� ���´�.
		
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
