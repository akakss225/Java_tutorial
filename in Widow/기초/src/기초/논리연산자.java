package ����;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {

		// A and(or) B ���� A�� B��ο� Boolean�� �;���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ͻ� ���̵� �Է����ּ��� : ");
		String id = sc.next();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Ͻ� ���̵��� ��й�ȣ�� �Է����ּ���: ");
		String passward = scan.next();
		
		Scanner check1 = new Scanner(System.in);
		System.out.print("���̵� : ");
		String name = check1.next();
		
		Scanner check2 = new Scanner(System.in);
		System.out.print("��й�ȣ : ");
		String num = check2.next();
		
		if(id.equals(name) && passward.equals(num)) {
				System.out.print("right");
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
