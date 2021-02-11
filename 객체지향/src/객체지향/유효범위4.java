package 객체지향;

class C{
	//여기서 클래스 내부의 전역변수 v는 클래스 전역에 영향을미친다.
	int v = 10;
	
	void m() {
		//하지만 매소드 m 내부에서 지정된 지역변수 v는 매소드에서 가장 먼저 사용되는 변수기 때문에 호출이 되는 것은 20이다.
		int v = 20;
		System.out.println(v);
		
		//여기서 변수 v에 this를 사용하게 되면, 전역변수v를 지정하게된다.
		System.out.println(this.v);
	}
}

public class 유효범위4 {

	public static void main(String[] args) {

		C c1 = new C();
		c1.m();

	}

}
