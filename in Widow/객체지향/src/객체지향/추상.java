package 객체지향;

//abstract로 지정된 클래스나 메소드는 직접 사용이 불가. 즉, 상속을 통한 사용을 강제한다.

abstract class A{
	public abstract int b();
	
	public void d() {
		System.out.println("world");
	}
	
}

class B extends A{
	public int b() {
		return 1;
	}
}

public class 추상 {

	public static void main(String[] args) {

		B obj = new B();

		obj.b();
		obj.d();
	}

}
