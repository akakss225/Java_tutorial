/* try {
 *    ������ �߻��� ����Ǵ� ����
 * }catch(����Ŭ���� �ν��Ͻ�){
 *    ���ܰ� �߻����� �� ����Ǵ� ����
 * }  
 */


class Cal{
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
			System.out.println("������ �߻��߽��ϴ�." + e.getMessage());
		}
	}
}

public class ����1 {

	public static void main(String[] args) {
		
		Cal c = new Cal();
		//���⼭ �и� 0�̶�� ���� ��������, ������ Ȯ���� �� �ִ�.
		c.set(10, 0);
		c.devide();

		

	}

}
