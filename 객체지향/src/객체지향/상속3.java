package ��ü����;

class DivisionableCalculator extends MultiplicationalbleCalculator{
	public void division() {
		System.out.println((double) (this.left / this.right));
	}
}

public class ���3 {

	public static void main(String[] args) {

		DivisionableCalculator c1 = new DivisionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		c1.multiple();
		c1.division();

	}

}
