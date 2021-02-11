import java.util.Scanner;

public class Main2반복 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 설정해주세요 : ");
		int num = sc.nextInt();

		int[] array = new int[num];
		int sum = 0;
		
		for(int i = 0; i < num; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1);
			sum += array[i];
		}
		System.out.println(num + "개의 배열에 무작위로 선택된 1~100의 수의 평균값은" + sum / num + "입니다."); 
sc.close();
	}

}
