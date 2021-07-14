package 다형성;

interface I2{
	public String A();
}
interface I3{
	public String B();
}

class D implements I2, I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}

public class PolymorphismDemo5 {

	public static void main(String[] args) {

		D obj = new D();
		I2 obj2 = new D();
		I3 obj3 = new D();
		
		System.out.println(obj.A());
		System.out.println(obj.B());
		System.out.println(obj2.A());
		//System.out.println(obj2.B());
		//System.out.println(obj3.A());
		System.out.println(obj3.B());

		/*즉, 여러 기능이 탑재되어있는 기계에 대하여 쓰고싶은 기능만을 사용하고,
		 * 나머지 기능에 대해서는 사용하지 않도록 방지하는 역할을 수행 할 수 있다.
		 * 즉, 하나의 인터페이스를 구현하는 여러개의 클래스에 대하여, 
		 * 같은 데이터타입을 갖지만, 실제 클래스에 따라서 다르게 동작하게 할 수 있다는 것이다. << 다형성
		 */
		
	}

}
