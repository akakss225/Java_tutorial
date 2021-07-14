package 기초;

public class 조건문 {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i++) {
			if(i < 6) {
				System.out.println(i + "는 6 보다 작다.");
			}
			else {
				System.out.println(i + "는 6 보다 크거나 같다.");
			}
		}
		
		
		String id = args[0];
		if(id.equals("egoing")) {
			System.out.println("right");
		}
		else {
			System.out.println("wrong");
		}
			
		

	}

}
