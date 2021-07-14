package °´Ã¼ÁöÇâ;

public class overloading2 {
	
	void A () {
		System.out.println("void A()");
		
	}
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	void A(String arg1) {
		System.out.println("void A(String arg1)");
	}

	public static void main(String[] args) {

		overloading2 od = new overloading2();
		od.A();
		od.A(1);
		od.A("coding everybody");

	}

}
