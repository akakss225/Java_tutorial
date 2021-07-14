package 다형성;

class A1{
	public String x() {
		return "A.x";
	}
	
}
class B1 extends A1{
	public String x() {
		return "B.x";
	}
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {

		A1 obj = new B1();
		System.out.println(obj.x());
		//System.out.println(obj.y());

		//overriding된 값이 출력이 된다.
		
		//마찬가지로 데이터타입은 A이기 때문에 class A에 정의되지 않은 메소드 y는 출력되지 않는다.
	}

}
