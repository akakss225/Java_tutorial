
public class while¹®¿¬½À {

	public static void main(String[] args) {

		int row = 1;
		
		while (row < 11) {
			int column = 1;
			while (column < 11) {
				System.out.printf("%4d", row * column);
				column++;
			}
			System.out.println();
			row++;
		}

	}

}
