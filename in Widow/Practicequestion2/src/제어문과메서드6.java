import java.util.Scanner;

public class ������޼���6 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ö�� : ");
		
		String chul = sc.next();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� : ");
		
		String young = scan.next();
		
		if(chul.equals("r") && young.equals("s") || chul.equals("s") && young.equals("p") || chul.equals("p") && young.equals("r"))
		{
			System.out.print("ö��, ��!");
		}
		else if(chul.equals("r") && young.equals("r") || chul.equals("s") && young.equals("s") || chul.equals("p") && young.equals("p")) {
			System.out.print("���º�");
		}
		else if(young.equals("r") && chul.equals("s") || young.equals("s") && chul.equals("p") || young.equals("p") && chul.equals("r"))
		{
			System.out.print("����, ��!");
		}
		else
		{
			System.out.print("�˰��� ����");
		}
		
		sc.close();
		scan.close();
		
	}

}
