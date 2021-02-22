import java.util.Scanner;

public class Num76 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char x = sc.next().charAt(0);
		
		char strat = 'a';
		
		do {
			System.out.print(strat + " ");
			strat += 1;
		}while(strat <= x);
		

	}

}
