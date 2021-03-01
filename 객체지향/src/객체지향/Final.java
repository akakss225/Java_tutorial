package 객체지향;


class Calculator12{
	// PI를 상수로 지정. 이는 전 class에 적용된다.
	static final double PI = 3.14;
	double left , right;
	
	public void setOprands(int left , int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
	public void cicle() {
		System.out.println(this.left * this.left * PI);
	}
	public void tower() {
		System.out.println(this.left * this.left * PI * this.right);
	}
	
}

//상속/변경을 금지하는 규제.
public class Final {

	
	public static void main(String[] args) {
				
		
		Calculator12 r = new Calculator12();
		
		r.setOprands(3, 10);
		r.sum();
		r.avg();
		r.cicle();
		r.tower();
				
		
		
		

	}

}
