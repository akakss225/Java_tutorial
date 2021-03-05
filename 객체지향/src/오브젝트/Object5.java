package 오브젝트;
//clone 메소드의 경우 protected라는 접근제어자를 가지고있음. 이는 패키지가 같아야지만 호출 할 수 있음을 뜻한다.
//하지만, 다른 패키지일지라도 상속은 가능하다.

/*class Human{
*	protected String test() {
*		return "test";
*	}
*}
*/

//cLoneable은 복제가 가능하냐 안하냐를 마킹해놓는 일종의 마커이다.

class Student1 implements Cloneable{
	String name;
	Student1(String name) {
		this.name = name;
	}
	public java.lang.Object clone() throws CloneNotSupportedException {
		return  super.clone();
	}
}
public class Object5 {

	public static void main(String[] args) {
		
		Student1 s = new Student1("수민");
		try {
			Student1 s1 = (Student1) s.clone();
			System.out.println(s.name);
			System.out.println(s1.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
