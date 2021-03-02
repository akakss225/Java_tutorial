package ´ÙÇü¼º;

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

	}

}
