//프로그램 내부에서 참조가 어떠한 방식으로 사용되는지 이해한다.
//기본적으로 new를 이용하여 생성하는 데이터는, '참조' 데이터 타입이다.

package 참조;



public class Reference1 {
	
	public static void runValue() {
		int a = 1; // 이것은 실제로 a 에 1이란 값을 넣은것이다.
		int b = a; // 여기서 b에 대입되는 a값은, 1이란 값을 받은 a가 맞지만, 복제된 것이다.
		b = 2; // 따라서 b를 2로 바꿔도, 처음에 a에 대입한 1 이라는 값은 변치 않는것이다.
		System.out.println("runValue, " + a);
	}

	public static void main(String[] args) {
		
		runValue();
		

	}

}
