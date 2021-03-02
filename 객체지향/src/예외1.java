
class Cal{
	int left,right;
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void devide() {
		try {
		System.out.print("계산결과는 ");
		System.out.print(this.left/this.right);
		System.out.print("입니다.");
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다." + e.getMessage());
		}
	}
}

public class 예외1 {

	public static void main(String[] args) {
		
		Cal c = new Cal();
		
		c.set(10, 0);
		c.devide();

		

	}

}
