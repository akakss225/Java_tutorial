package ��ü����;

class MultiplicationalbleCalculator extends SubstractionableCalculator{
	public void multiple() {
		System.out.println(this.left * this.right);
	}
}

public class ���2 {

	public static void main(String[] args) {

		MultiplicationalbleCalculator c1 = new MultiplicationalbleCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		c1.multiple();
	}

}
