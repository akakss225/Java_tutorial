import java.util.Scanner;

public class ������޼���7 {
	
	public static void whoswin(String x, String y) {
		
		if(x.equals("r") && y.equals("s") || x.equals("s") && y.equals("p") || x.equals("p") && y.equals("r"))
		{
			System.out.print("ö��, ��!");
		}
		else if(x.equals("r") && y.equals("r") || x.equals("s") && y.equals("s") || x.equals("p") && y.equals("p"))
		{
			System.out.print("���º�");
		}
		else
		{
			System.out.print("����, ��!");
		}
		
	}
	public static String input(String a) {
		String pick;
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s : ", a);
		pick = sc.next();
		return pick;
		
	}

	public static void main(String[] args) {
		
		String c = input("ö��");
		String y = input("����");
		whoswin(c, y);

	}

}
