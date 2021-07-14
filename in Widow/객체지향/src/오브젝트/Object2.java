package 오브젝트;

class Calculator{
	int left, right;
	
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Object2 {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		c.set(10, 20);
		
		//그냥 매개변수인 c만 입력하는것과 toString은 같은 출력값을 나타낸다.
		//즉, 오브젝트 클래스인 toString은 생략이 된 상태이지만, 그 기능을 수행한다.
		//여기서 toString에 대하여, 사용자가 오버라이딩을 통해 원하는 오브젝트를 수정 할 수 있다.
		
		System.out.println(c.toString());

	}

}
