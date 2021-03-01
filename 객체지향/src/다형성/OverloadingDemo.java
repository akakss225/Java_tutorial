package 다형성;

class O{
	public void a(int param) {
		System.out.println("숫자입력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자입력");
		System.out.println(param);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");

		

	}

}
