package 기초;

public class 비교연산자 {

	public static void main(String[] args) {

		System.out.println(1 == 2);
		System.out.println(1 == 1);
		System.out.println("one" == "two");
		System.out.println("one" == "one");
		
		System.out.println(1 < 2);
		System.out.println(1 > 2);
		
		System.out.println(1 != 2);
		System.out.println(1 != 1);
		System.out.println("one" != "two");
		System.out.println("one" != "two");
		
		
		String a = "Hello world!";
		String b = new String("Hello world!");
		
		System.out.println(a == b);	
		System.out.println(a.equals(b));

	}

}
