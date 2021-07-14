import java.util.Scanner;

public class Á¦¾î¹®°ú¸Þ¼­µå7 {
	
	public static void whoswin(String x, String y) {
		
		if(x.equals("r") && y.equals("s") || x.equals("s") && y.equals("p") || x.equals("p") && y.equals("r"))
		{
			System.out.print("Ã¶¼ö, ½Â!");
		}
		else if(x.equals("r") && y.equals("r") || x.equals("s") && y.equals("s") || x.equals("p") && y.equals("p"))
		{
			System.out.print("¹«½ÂºÎ");
		}
		else
		{
			System.out.print("¿µÈñ, ½Â!");
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
		
		String c = input("Ã¶¼ö");
		String y = input("¿µÈñ");
		whoswin(c, y);

	}

}
