
public class Main {

	final static int N = 30;
	final static int A = 15;
	
	
	public static void main(String[] args) {

		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+�Դϴ�.");
		}
		else if(score >= 80)
		{
			System.out.println("B+�Դϴ�.");
		}
		else if(score >= 70)
		{
			System.out.println("C+�Դϴ�.");
		}
		else
		{
			System.out.println("F�Դϴ�.");
			
		}
		
		String a = "Man";
		int b = 0;
		
		// �ڹٴ� String�� ���� �� equal()�� �̿��մϴ�.
		// �� ������ String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� �����Դϴ�.
		if(a.equals("Man"))
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("���ڰ� �ƴմϴ�.");
		}
		if(b == 3)
		{
			System.out.println("3�Դϴ�.");
		}
		else
		{
			System.out.println("3�� �ƴմϴ�.");
		}
		if(a.equalsIgnoreCase("man")) 
		{
			System.out.println("���Դϴ�.");
			
		}
		else
		{
			System.out.println("�����Դϴ�.");
			
		}
		int c = 1, sum = 0;
		while(c <=1000)
		{
			sum += c++;
		}
		System.out.println("1���� 1000������ ���� " + sum + "�Դϴ�.");
		
		// for�� : �ʱ�ȭ�κ�, ���� �κ�, ���� �κ�
		for(int x = N; x > 0; x--)
		{
			for(int y = x; y > 0; y--)
			{
			System.out.print("��");
		}
		System.out.println();
		}
		// q^2 + p^2 = r^2
		for(int i = -A; i <= A; i++)
		{
			for(int j = -A; j <= A; j++)
			{
				if(i * i + j * j <= A * A )
				{
					System.out.print("��");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
