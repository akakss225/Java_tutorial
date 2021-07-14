class DivideException1 extends ArithmeticException{
	
	DivideException1(){
		super();
	}
	
	DivideException1(String message){
		super(message);
	}
}
class Cal4{
	int left,right;
	public void set(int left, int right) {
		
		this.left = left;
		this.right = right;
	}
	public void devide() throws DivideException1
	{
		if(right == 0)
		{
			throw new DivideException1("0으로 나눌 수 없습니다.");
		}
		System.out.print(this.left/this.right);
		
	}
}



public class 예외9 {

	public static void main(String[] args) {

		Cal4 c1 = new Cal4();
		c1.set(10, 0);
		
		try {
			c1.devide();
		}catch(DivideException1 e) {
			System.out.println(e.getMessage());
		}
		  
	}

}