package 기초;

import java.util.Scanner;

public class 조건문과스캐너 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("생성하실 아이디를 입력해주세요 : ");
		String id = sc.next();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("생성하신 아이디의 비밀번호를 입력해주세요: ");
		String passward = scan.next();
		
		Scanner check1 = new Scanner(System.in);
		System.out.print("아이디 : ");
		String name = check1.next();
		
		Scanner check2 = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		String num = check2.next();
		
		if(id.equals(name)) {
			if(passward.equals(num)) {
				System.out.print("right");
			}
			else {
				System.out.print("wrong");
			}
			
		}
		else {
			System.out.print("wrong");
		}
		
		sc.close();
		scan.close();
		check1.close();
		check2.close();
	}

}
