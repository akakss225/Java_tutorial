package ����;

public class �޼ҵ����Է°���� {

	//int i ��� parameter�� ���������ν� �������� ������ ����.
	//void�� ���������� �� ������ ���Ѵ�. �� �޼ҵ�տ� void�� �ִٸ�, �� �޼ҵ��� return���� �������� ������ �ǹ��Ѵ�.
	public static void numbering1(int i, int j) {
		
		while (i < j) {
			
			System.out.println(i);
			i++;
		}
	}
	public static String numbering2(int x, int y) {
		
		String output = "";
		while(x < y) {
			output += x;
			x++;
		}
		return output;
		
		
	}

	public static void main(String[] args) {
		//argument�Է�(�������� �κ�)
		numbering1(3,7);
		
		String result = numbering2(3,7);
		System.out.println(result);
		

	}

}
