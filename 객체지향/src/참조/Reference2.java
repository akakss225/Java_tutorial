package 참조;

class A{
	public int id;
	A(int id){
		this.id = id;
	}
}

public class Reference2 {
	
	public static void runValue() {
		int a = 1;
		int b = a; // 복제된 a가 변수 b에 담기게 된다. 즉, a의 기본값과 b의 값은 무관한 것이다.
		b = 2; 
		System.out.println("runValue, " + a);
	}
	public static void runReference() {
		A a = new A(1); // 여기서 변수 a는 클래스 A의 인스턴스가 위치하는 위치에대한 정보를 가지고있다.
		A b = a; //기본 데이터타입이 담겨있는 a를 b에 담으면, b내부에서 1 이라는 값이 복제가 된다.
		// 여기서 다른점은 변수 b에는 인스턴스a가 복제되어 새로들어가는게 아닌, 변수 a가 가리키고있는 인스턴스 A에대한 주소값을 갖는다.
		b.id = 2; //따라서 여기서 b.id = 2 라는 말은 즉슨 클래스 A를 이용해 만든 인스턴스가 갖는 변수를 2 로 변경시킴을 뜻한다.
		System.out.println("runReference, " + a.id);
	}

	public static void main(String[] args) {

		runValue();
		runReference(); //주소를 공유하기 때문에, 주소에 담긴 값 자체가 변함. 따라서 a도 2가 출려됨.
		//이는 기본 데이터타입을 담을 수 있는 변수에 담긴 값과, new를 통해 만들어진 데이터 타입을 사용하는 변수에 담긴 값은 다름을 알 수 있다.
	}

}
