	/* IOException은 ArithmeticException과 다르게 반드시 예외처리를 해야한다.
	* ArithmeticException는 부모중에 RuntimeException이 존재한다.
	* 이러한 RuntimeException이 없는 IOException같은 예외를
	* Checked Exception이라고하고, 반대는 Unchecked Exception이라고 한다.
	* Checked Exception의 경우 반드시 try catch 혹은 throws를 이용해
	* 예외처리를 해주어야한다.
	* 이를 이용하여 나만의 Exception을 만들 수 있다.
	*/
//이때 부모class를 Exception 혹은 IOException으로 해주면, checked Exception이기 때문에, 반드시 예외처리를 해주어야한다.
class DivideException extends ArithmeticException //Exception 
{
	//기본 생성자는 존재하지만,
	DivideException(){
		super();
	}
	//기본 생성자가 아니면, 직접 만들어주어야 한다.
	DivideException(String message){
		super(message);
	}
}
class Cal3{
	int left,right;
	public void set(int left, int right) {
		
		this.left = left;
		this.right = right;
	}
	public void devide() //throws DivideException
	{
		
		if(right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.");
		}			
		System.out.print(this.left/this.right);
		}
	}



public class 예외8 {

	public static void main(String[] args) {

		Cal3 c1 = new Cal3();
		/*try {
		 * c1.devide();}
		 * catch(DivideException e){
		 * System.out.println(e.getMessage);}
		 */
		
		c1.set(10, 0);
		c1.devide();

	}

}
