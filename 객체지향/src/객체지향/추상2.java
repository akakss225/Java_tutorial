package 객체지향;

abstract class Calculator11{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
	
}
class CalculatorDecoPlus extends Calculator11{
	public void sum() {
		System.out.println("+ sum : " + (this.left + this.right) );
	}
	public void avg() {
		System.out.println("+ avg : " + (this.left + this.right)/2);
	}
}
class CalculatorDecoMinus extends Calculator11{
	public void sum() {
		System.out.println("- sum : " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("- avg : " + (this.left + this.right)/2);
	}
}

public class 추상2 {

	public static void main(String[] args) {

		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		
		c1.setOprands(10, 20);
		c1.run();
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		
		c2.setOprands(20, 40);
		c2.run();

	}

}
