package ������;

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

		//class B�� �ν��Ͻ�ȭ ��Ű�µ� �׿����� ������ ������Ÿ���� A�� ����Ѵ�.
		
		A obj = new B();
		System.out.println(obj.x());
		//obj.y();
		//class B�� �ν��Ͻ�ȭ ������, ������Ÿ���� A�̱� ������ �޼ҵ� y�� ������� ���Ѵ�.

	}

}
