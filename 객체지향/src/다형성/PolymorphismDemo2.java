package ������;

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

		//overriding�� ���� ����� �ȴ�.
		
		//���������� ������Ÿ���� A�̱� ������ class A�� ���ǵ��� ���� �޼ҵ� y�� ��µ��� �ʴ´�.
	}

}
