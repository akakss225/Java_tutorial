
public class Main2���� {
	
	public static int function(int number) {
		if(number == 1)
			return 1;
		else
			return number + function(number - 1);
	}

	public static void main(String[] args) {
		System.out.println("10���� 1������ ����" + function(10) + "�Դϴ�.");

	}

}
