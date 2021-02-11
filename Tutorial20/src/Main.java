
public class Main implements 인터페이스 {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.show();

		

	}

	@Override
	public void crying() {

		System.out.println("월! 월!");
		
	}

	@Override
	public void show() {

		System.out.println("Hello World!");
		
	}

}
