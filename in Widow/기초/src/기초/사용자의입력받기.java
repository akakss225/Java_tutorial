package 기초;

import java.util.Scanner;

public class 사용자의입력받기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		System.out.println(i*i);
		sc.close();

	}

}
