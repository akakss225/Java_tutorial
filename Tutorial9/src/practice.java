
public class practice {
	
	public static int function(int a, int b) {
		for(int i = a * b; i > 0; i--)
		{
			if(i * a == i * b)
			{
				return i;
			}
			
			
		}
		return -1;
		
		
	}

	public static void main(String[] args) {

		System.out.println("110과 130의 최소공배수는 " + function(110, 130) + "입니다.");

	}

}
