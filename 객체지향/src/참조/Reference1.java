//���α׷� ���ο��� ������ ��� ������� ���Ǵ��� �����Ѵ�.
//�⺻������ new�� �̿��Ͽ� �����ϴ� �����ʹ�, '������(�����ڷ���)' ������ Ÿ���̴�.

package ����;



public class Reference1 {
	
	public static void runValue() {
		int a = 1; // �̰��� ������ a �� 1�̶� ���� �������̴�.
		int b = a; // ���⼭ b�� ���ԵǴ� a����, 1�̶� ���� ���� a�� ������, ������ ���̴�.
		b = 2; // ���� b�� 2�� �ٲ㵵, ó���� a�� ������ 1 �̶�� ���� ��ġ �ʴ°��̴�.
		System.out.println("runValue, " + a);
	}

	public static void main(String[] args) {
		
		runValue();
		

	}

}
