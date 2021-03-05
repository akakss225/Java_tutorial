package 오브젝트;

class Calculator1{
	int left, right;
	
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	
	//toString 오브젝트를 오버라이딩 할 수 있다.
	public String toString() {
		return "left : " + this.left + ", right : " + this.right;
	}
}

public class Object2_1 {

	public static void main(String[] args) {

		Calculator1 c = new Calculator1();
		
		c.set(10, 20);
		
		System.out.println(c.toString());

	}

}
