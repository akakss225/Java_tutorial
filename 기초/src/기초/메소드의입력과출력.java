package 기초;

public class 메소드의입력과출력 {

	//int i 라는 parameter를 설정함으로써 고정적인 변수로 지정.
	//void는 사전적으로 빈 공간을 뜻한다. 즉 메소드앞에 void가 있다면, 이 메소드의 return값은 존재하지 않음을 의미한다.
	public static void numbering1(int i, int j) {
		
		while (i < j) {
			
			System.out.println(i);
			i++;
		}
	}
	public static String numbering2(int x, int y) {
		
		String output = "";
		while(x < y) {
			output += x;
			x++;
		}
		return output;
		
		
	}

	public static void main(String[] args) {
		//argument입력(가변적인 부분)
		numbering1(3,7);
		
		String result = numbering2(3,7);
		System.out.println(result);
		

	}

}
