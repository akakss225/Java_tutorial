
public class Main {

	final static int SECOND = 1000;
	
	
	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "��" + second + "��");
		
		int a = 10;
		
		System.out.println("������ a�� " + a + "�Դϴ�.");
		a++;
		System.out.println("������ a�� " + a + "�Դϴ�.");
		System.out.println("������ a�� " + ++a + "�Դϴ�.");
		System.out.println("������ a�� " + a++ + "�Դϴ�.");
		System.out.println("������ a�� " + a + "�Դϴ�.");
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int b = 50;
		int c = 50;
		

		System.out.println("b�� c�� ��������? " + (b == c));
		System.out.println("b�� c�� ū����? " + (b > c));
		System.out.println("b�� c�� ��������? " + (b < c));
		System.out.println("b�� c�� �����鼭 b�� 30���� ū����? " + ((b == c) && (b > 30)));
		System.out.println("b�� 50�� �ƴѰ���?" + !(b == 50));
		
		
		
	}

}
