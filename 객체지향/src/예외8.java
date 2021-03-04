	/* IOException�� ArithmeticException�� �ٸ��� �ݵ�� ����ó���� �ؾ��Ѵ�.
	* ArithmeticException�� �θ��߿� RuntimeException�� �����Ѵ�.
	* �̷��� RuntimeException�� ���� IOException���� ���ܸ�
	* Checked Exception�̶���ϰ�, �ݴ�� Unchecked Exception�̶�� �Ѵ�.
	* Checked Exception�� ��� �ݵ�� try catch Ȥ�� throws�� �̿���
	* ����ó���� ���־���Ѵ�.
	* �̸� �̿��Ͽ� ������ Exception�� ���� �� �ִ�.
	*/
//�̶� �θ�class�� Exception Ȥ�� IOException���� ���ָ�, checked Exception�̱� ������, �ݵ�� ����ó���� ���־���Ѵ�.
class DivideException extends ArithmeticException //Exception 
{
	//�⺻ �����ڴ� ����������,
	DivideException(){
		super();
	}
	//�⺻ �����ڰ� �ƴϸ�, ���� ������־�� �Ѵ�.
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
			throw new DivideException("0���� ���� �� �����ϴ�.");
		}			
		System.out.print(this.left/this.right);
		}
	}



public class ����8 {

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
