class Cal1{
	int left,right;
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void devide() {
		/* try catch���� ���ܸ� ����ϴ� ���� �⺻���� �����̴�.
		 * �̴� try catch�� ���ο� ������ �߻���ų �� �ִ� �ڵ���� ���� �� ��,
		 * �� ������ ����� ���ִ� ������ �����Ѵ�.
		 */
		try {
			//ù��° ������ ����� ���� �� �� ����.
		System.out.print("������� ");
		//�ι�° ���� ��µ��� ������ �� �� �ִ�. ��, ���⼭ ������ �������� �� �� �ִ�.
		System.out.print(this.left/this.right);
		System.out.print("�Դϴ�.");
		}catch(Exception e) {
			//������ �߻��߽��ϴ�./ by zero
			//������ �޼���
			System.out.println("\n\ne.getMessage\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStrackTrace()");
			e.printStackTrace();
		}
	}
}


public class ����2 {

	public static void main(String[] args) {
		
		Cal1 c = new Cal1();
		//���⼭ �и� 0�̶�� ���� ��������, ������ Ȯ���� �� �ִ�.
		c.set(10, 0);
		c.devide();

	}

}
