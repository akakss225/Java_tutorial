package 인터페이스;

class CalculatorDummy implements Calculatable{
	public void setOprands(int first, int second, int third) {
		
	}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}

public class CalculatorConsumer2 {

	public static void main(String[] args) {

		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum() + c.avg());

	}

}
