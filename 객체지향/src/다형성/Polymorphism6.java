package 다형성;

interface father{
	
}
interface mother{
	
}
interface programmer{
	public void coding();
}
interface beliver{
	
}
class Steve implements father, programmer, beliver{
	public void coding(){
		System.out.println("fast");
		
	}
	
}
class Rachel implements mother, programmer{
	public void coding() {
		System.out.println("elegance");
	}
}

public class Polymorphism6 {

	public static void main(String[] args) {

		programmer steve = new Steve();
		programmer rachel = new Rachel();
		
		steve.coding();
		rachel.coding();
		
		//프로그래머로써 스티브의 개인적인 사항들은 불필요하기 때문에, 다른것을 고려하지 않게 해주기 위해 이러한 과정을 이용한다.

	}

}
