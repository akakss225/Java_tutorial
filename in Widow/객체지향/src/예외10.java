class DivideException2 extends ArithmeticException{
	public int left;
	public int right;
	
	DivideException2(){
		super();
	}
	
	DivideException2(String message, int left, int right){
		super(message);
		this.left = left;
		this.right = right;
	}
}
class Cal5{
	int left,right;
	public void set(int left, int right) {
		
		this.left = left;
		this.right = right;
	}
	public void devide() throws DivideException2
	{
		if(right == 0)
		{
			throw new DivideException2("0으로 나눌 수 없습니다.", this.left, this.right);
		}
		System.out.print(this.left/this.right);
		
	}
}



public class 예외10 {

	public static void main(String[] args) {

		Cal5 c1 = new Cal5();
		c1.set(10, 0);
		
		try {
			c1.devide();
		}catch(DivideException2 e) {
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
		  
	}

}