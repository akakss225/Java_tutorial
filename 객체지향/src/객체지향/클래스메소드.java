package 객체지향;

class C1{
	static int static_variable = 1;
	int instance_variable = 2;
	//static void라는 것은 클래스 메소드라는 것을 의미한다.
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		//System.out.println(instance_variable);
	}
	void instance_static() {
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
}
		

public class 클래스메소드 {

	public static void main(String[] args) {
		
		
		C1 c = new C1();
		
		//c.static_static();
		
		//c.static_instance();
		
		//c.instance_static();
		
		//c.instance_instance();
		
		//C1.static_static();
		
		//C1.static_instance();
		
		//C1.instance_static();
		
		//C1.instance_instance();

		

	}

}
