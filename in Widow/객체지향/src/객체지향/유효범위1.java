package ��ü����;

public class ��ȿ����1 {
//���� �̸��� ����ϸ�, �ǹ��� �浹�� �Ͼ �� �ִ�. �̸� �ذ��ϱ� ���Ͽ� ��ȵ� ����� �ٷ� ��ȿ����(Scope)�̴�.
	
	static void a() {
		int i = 0;
	}
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++)
		{
			/*�̶� �޼ҵ� a ������ ���� i�� �޼ҵ� ���ο����� ��ȿ�ϰ� �ȴ�
			 * ��, �޼ҵ� �ٱ������� �۵����� �ʰ��ϴ� �̷��� ����� ��ȿ������� �Ѵ�.
			 */
		
			a();
			System.out.println(i);
		}

	}

}
