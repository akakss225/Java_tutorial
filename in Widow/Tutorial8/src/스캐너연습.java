import java.util.Scanner;

public class ��ĳ�ʿ��� {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("ù��° �Ǽ� �Է� : ");
	    
	    double j = scan.nextDouble();
	    
	    Scanner sscan = new Scanner(System.in);
	    System.out.print("�ι�° �Ǽ� �Է� : ");
	    		
	    double p = sscan.nextDouble();
	    
	    double A = Math.pow(j, p);
	    
	    System.out.print("ù��° �Էµ� �Ǽ��� �ι�° �Ǽ���ŭ�� �ŵ������� ���� " +(int) A + "�Դϴ�.");
	    scan.close();
	    		
		scan.close();
		sscan.close();

	}

}
