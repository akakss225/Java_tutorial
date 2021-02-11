package 객체지향;

class Calculator2{
	
	//static 한 변수는 클래스 소속임을 의미하고, 모든 인스턴스에서 동일한 값을 갖음을 의미함.
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOprands(int left , int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base) / 2);
	}
	
}

public class 클래스멤버와인스턴스멤버 {

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
		System.out.println(c1.PI);
		
		Calculator2 c2 = new Calculator2();
		System.out.println(c2.PI);
		
		System.out.println(Calculator2.PI);
		
		
		c1.setOprands(10, 20);
		c2.setOprands(20, 40);
		
		Calculator2.base = 10;
		
		c1.sum();
		c2.sum();
		
        Calculator2.base = 20;
		
		c1.sum();
		c2.sum();
		
	}

}
