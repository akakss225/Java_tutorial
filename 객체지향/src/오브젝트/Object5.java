package ������Ʈ;
//clone �޼ҵ��� ��� protected��� ���������ڸ� ����������. �̴� ��Ű���� ���ƾ����� ȣ�� �� �� ������ ���Ѵ�.
//������, �ٸ� ��Ű�������� ����� �����ϴ�.

/*class Human{
*	protected String test() {
*		return "test";
*	}
*}
*/

//cLoneable�� ������ �����ϳ� ���ϳĸ� ��ŷ�س��� ������ ��Ŀ�̴�.

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
		
		Student1 s = new Student1("����");
		try {
			Student1 s1 = (Student1) s.clone();
			System.out.println(s.name);
			System.out.println(s1.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
