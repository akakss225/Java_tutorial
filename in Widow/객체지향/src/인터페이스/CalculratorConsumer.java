package 인터페이스;



public class CalculratorConsumer {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.setOprands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
		

	}

}
