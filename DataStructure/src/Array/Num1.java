package Array;

public class Num1 {

	public static void main(String[] args) {
		//�Ϲ����� �迭�� ���.
		String[] students = {"������", "���̶�", "������", "������", "������"};
		
		for(int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
		
		//�پ��� ����� �迭
		int[] numbers1 = new int[4]; //new�� ��������ν� ��ü�ν� ������ش�.
		String[] string = new String[4]; //�������� ������ ���·� �迭�� ���� �� �ִ�.
		
		//�迭�� ���� �־��ִ� ����� ���������� �����Ѵ�.
		
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
		
		int[] numbers2 = {10,20,30,40};
		int[] numbers3 = new int[] {10,20,30,40};
		
		System.out.println(numbers1[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers3[2]);
		System.out.println(numbers1[3]); // �⺻������ ��ü�ν� ������ �迭�� ���, ����ִ� ���� null���� �ֱ� ������ 0�� ��µȴ�.
		System.out.println(numbers1.length); // length�� ��� ���� ��� �����ߴ����� ������� ����. ��, �迭�� ũ�⸸�� �˷���
		
		int i = 0;
		while(numbers1.length > i)
		{
			System.out.println(numbers1[i]);
			i++;
		}
		
		
		
	}

}
