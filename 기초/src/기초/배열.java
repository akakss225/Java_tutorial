package ����;

public class �迭 {

	public static void main(String[] args) {

		String[] classGroup = {"������","������","���̶�","�̰���"};
		
		for(int i = 0; i <= 3; i++ )
			System.out.println(classGroup[i]);
		//�⺻ �迭
		String[] members = {"������","������","���̶�"};
		for(int i = 0; i < members.length; i++)
		{
			String member = members[i];
			System.out.println(member + "�� ����� �޾ҽ��ϴ�.");
		}
		//�ݺ��� �迭
		String[] memberss = {"������","������","���̶�"};
		for(String e : memberss)
		{
			System.out.println(e + "�� ����� ���� �ʾҽ��ϴ�.");
		}
		//for-each�� �迭
		
		
		
		

	}

}
