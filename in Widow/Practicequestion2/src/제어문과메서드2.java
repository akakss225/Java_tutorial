import java.util.Scanner;

public class 제어문과메서드2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("등수를 입력해 주세요 : ");
		
		int rank = sc.nextInt();
		
		switch(rank) {
		
		case 1:
			System.out.print("아주 잘했습니다.");
			break;
		case 2:
			System.out.print("잘했습니다.");
			break;
		case 3:
			System.out.print("잘했습니다.");
			break;
		case 4:
			System.out.print("보통입니다.");
			break;
		case 5:
			System.out.print("보통입니다.");
			break;
		case 6:
			System.out.print("보통입니다.");
			break;
		default :
			System.out.print("노력해야겠습니다.");
		}
		sc.close();

	}

}
