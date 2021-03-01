package 다형성;

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("+ " + (this.left + this.right)/2 );
	}
}
class CalculatorDecoMinus extends Calculator{
	public void sum() {
		System.out.println("- " + (this.left + this.right));
	}
	public void avg() {
		System.out.println("- " + (this.left + this.right)/2 );
	}
}

public class PolymorphismDemo4 {
	
	public static void execute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();
	}

	public static void main(String[] args) {

		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		
		
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(20, 40);
		
		
		execute(c1);
		execute(c2);

	}

}
