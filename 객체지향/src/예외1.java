
class Cal{
	int left,right;
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void devide() {
		try {
		System.out.print("������� ");
		System.out.print(this.left/this.right);
		System.out.print("�Դϴ�.");
		}catch(Exception e) {
			System.out.println("������ �߻��߽��ϴ�." + e.getMessage());
		}
	}
}

public class ����1 {

	public static void main(String[] args) {
		
		Cal c = new Cal();
		
		c.set(10, 0);
		c.devide();

		

	}

}
