
public class Main {

	public static void main(String[] args) {

		String a = "I Love You.";
		if(a.contains("Love"))
		{
			// 포함하는 경우 실행되는 부분
			System.out.println("Me Too.");
			
		}
		else
		{
			// 포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You.");
			
		}
		String b = "I Want You.";
		if(b.contains("Want"))
		{
			// 포함하는 경우 실행되는 부분
			System.out.println("I Want You Too.");
		}
		else
		{
			// 포함하지 않는 경우 실행되는 부분
			System.out.println("I Don't Want You!");
			
		}
		
	
	}

}
