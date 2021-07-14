import java.util.Scanner;

public class Main1반복 {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하여 배열의 크기를 선택하십시오 : ");
		int number = sc.nextInt();
		int[] array = new int[number];
		
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 선택될 정수를 입력해주세요 : ");
			array[i] = sc.nextInt();
			
		}
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
			System.out.print("선택된 배열의 정수중 가장 큰 값은 : " + result + "입니다.");
 sc.close();
	}

}
