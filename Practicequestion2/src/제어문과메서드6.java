import java.util.Scanner;

public class Á¦¾î¹®°ú¸Þ¼­µå6 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ã¶¼ö : ");
		
		String chul = sc.next();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¿µÈñ : ");
		
		String young = scan.next();
		
		if(chul.equals("r") && young.equals("s") || chul.equals("s") && young.equals("p") || chul.equals("p") && young.equals("r"))
		{
			System.out.print("Ã¶¼ö, ½Â!");
		}
		else if(chul.equals("r") && young.equals("r") || chul.equals("s") && young.equals("s") || chul.equals("p") && young.equals("p")) {
			System.out.print("¹«½ÂºÎ");
		}
		else if(young.equals("r") && chul.equals("s") || young.equals("s") && chul.equals("p") || young.equals("p") && chul.equals("r"))
		{
			System.out.print("¿µÈñ, ½Â!");
		}
		else
		{
			System.out.print("¾Ë°í¸®Áò ¿À·ù");
		}
		
		sc.close();
		scan.close();
		
	}

}
