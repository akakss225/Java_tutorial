
public class ����������Լ�2 {
	
	public static int function(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println("3050�� 10��° ����� " + function(3050, 10) + "�Դϴ�.");

	}

}
