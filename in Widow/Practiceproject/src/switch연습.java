import java.util.Scanner;

public class switch연습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int rank = sc.nextInt();
		
		switch (rank) {
		case 1 :
			System.out.println("일등입니다.");
			break;
		case 2 :
			System.out.println("이등입니다.");
			break;
		case 3 :
			System.out.println("삼등입니다.");
			break;
		default :
			System.out.println("등외입니다.");
			
		}
		sc.close();
	}

}
