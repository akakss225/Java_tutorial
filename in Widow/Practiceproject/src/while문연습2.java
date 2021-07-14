
public class while¹®¿¬½À2 {

	public static void main(String[] args) {

	
		int row = 2;
		
		do {
			int column = 1;
			do {
				System.out.printf("4%d", row * column);
				column++;
			} while (column < 10);
			System.out.println();
			row++;
		}while (row < 10);
		
	
	}

}
