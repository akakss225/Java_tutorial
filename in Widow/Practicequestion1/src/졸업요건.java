import java.util.Scanner;

public class 졸업요건 {

	//졸업시 필요한 총 이수학점은 140이며, 이중 전공학점은 70, 교양및 일반 학점은 각각30 또는 총점 80이상이어야 한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		
		int a = sc.nextInt();
		
		Scanner sca = new Scanner(System.in);
		System.out.print("교양 이수 학점 : ");
		
		int b = sca.nextInt();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("일반 이수 학점 : ");
		
		int c = scan.nextInt();
		
		if(a >= 70 && a + b + c >= 140 && b >= 30 && c >= 30)
		{
			System.out.print("졸업 가능");
		}
		else if(a >= 70 && a + b + c >= 140 && b + c >= 80)
		{
			System.out.print("졸업 가능");
		}
		else
		{
			System.out.print("졸업 불가능");
		}
		
		sc.close();
		sca.close();
		scan.close();
	}

}
