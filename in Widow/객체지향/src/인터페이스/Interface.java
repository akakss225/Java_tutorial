package 인터페이스;

//하나의 class는 여러개의 interface를 구현할 수 있다.

/*interface는 반드시 public이다.
 * 인터페이스는 그 인터페이스를 구현한 클래스를 어떻게 조작할 것인가를 규정하기 떄문에
 * 외부에서 제어 할 수 있는 가장 개방적인 접근 제어자인 public만을 허용한다.
 */

public interface Interface {
	public void x();

}
interface I1{
	public void y();
}
interface I2{
	public void z();
}

abstract class A implements I1, I2{
	public void x() {}
	public void z() {}
}
//또한 interface는 상속이 가능하다. 이는 위의 코드를 좀 더 간결하게 만들어 준다.

/*인터페이스와 추상 클래스는 서로 비슷한 듯 다른 기능이다.
 * 인스턴스는 클래스가 아닌 인스턴스라는 고유한 형태를 가지고 있는 반면, 추상 클래스는 일반적인 클래스이다.
 * 인스턴스는 구체적인 로직이나 상태를 가지고 있을 수 없고, 추상 클래스는 구체적인 로직이나 상태를 가지고 있으 수 있다.
 */