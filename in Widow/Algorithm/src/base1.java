
public class base1 {

	public static void main(String[] args) {
		
		// ���� �������� �˰��� : ����
		// ��������
		
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
		
		// ����ð��� ������ �����ɸ�. N * ( N + 1 ) / 2 �� Ȯ���ؾ��ϱ� ����.
		// N * N �� ����ð��� �ɸ��ٰ� ǥ����. ���(O) ǥ�������, O(N*N)�̶�� ǥ����.
		// ���� ���������� ��� O(N^2) ����ð��� �ɸ���.

		
		
		
		
		
	}

}
