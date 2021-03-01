package 다형성;

class A{
	public String x() {
		return "x";
	}
	
}
class B  extends A  {
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {

		//class B를 인스턴스화 시키는데 그에대한 변수의 데이터타입은 A로 사용한다.
		
		A obj = new B();
		System.out.println(obj.x());
		//obj.y();
		//class B를 인스턴스화 했지만, 데이터타입은 A이기 때문에 메소드 y를 출력하지 못한다.

	}

}
