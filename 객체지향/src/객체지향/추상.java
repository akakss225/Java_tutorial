package ��ü����;

//abstract�� ������ Ŭ������ �޼ҵ�� ���� ����� �Ұ�. ��, ����� ���� ����� �����Ѵ�.

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

public class �߻� {

	public static void main(String[] args) {

		B obj = new B();

		obj.b();
		obj.d();
	}

}
