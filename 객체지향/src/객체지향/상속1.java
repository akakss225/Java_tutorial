package ��ü����;

class Calculator4{
	int left,right;
	int third = 0;
	
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class SubstractionableCalculator extends Calculator4{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ���1 {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		

	}

}
