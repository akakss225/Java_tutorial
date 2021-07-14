import java.util.Scanner;

public class 시간환산 {
	
	//초를 입력하면 시간, 분, 초로 환산해 출력하는 프로그램

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		int hour = (int) (a / 3600);
		int min = (int) ((a / 60) % 60);
		int sec = (int) (a % 60);
		
		System.out.print(hour + "시간 " + min + "분 " + sec + "초");
		sc.close();
		

	}

}
