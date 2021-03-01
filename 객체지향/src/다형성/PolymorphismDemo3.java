package ´ÙÇü¼º;

class B2 extends B1{
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo3 {

	public static void main(String[] args) {
		
		A1 obj = new B1();
		A1 obj1 = new B2();
		
		System.out.println(obj.x());
		System.out.println(obj1.x());
		
	}

}
