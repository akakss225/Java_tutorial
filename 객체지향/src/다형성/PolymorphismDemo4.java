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

		/*이때 굳이 데이터타입과 인스턴스를 다르게 하는 이유는
		 * 위에서 볼 수 있듯, 서로 다른 메소드를 출력해야하는 상황에 반하여
		 * 출력하는 방식은 동일하게 통일 시켜줄 수 있다는 장점이 있기 때문이다.
		 * execute메소드를 실행 할 때 코드를 굳이 plus와 minus로 나누지 않아도 된다는 장점이 존재한다.
		 */
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		
		
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(20, 40);
		
		
		execute(c1);
		execute(c2);

	}

}
