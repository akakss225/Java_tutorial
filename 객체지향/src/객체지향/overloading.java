package °´Ã¼ÁöÇâ;

class Calculator5 extends DivisionableCalculator{
	public void setOprands(int left, int right, int third) {
		this.left = left;
		this.right = right;
		this.third = third;
	}
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	public void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
	
}

public class overloading {

	public static void main(String[] args) {

		Calculator5 c1 = new Calculator5();
		c1.setOprands(10, 20, 30);
		c1.sum();
		c1.avg();

	}

}
