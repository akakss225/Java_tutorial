import java.io.IOException;

/* ������ ���� 
 * illegalArgumentException : �Ű������� �ǵ����� ���� ��Ȳ�� ���߽�ų ��
 * IllegalStateException : �޼ҵ带 ȣ���ϱ� ���� ��Ÿ�� �ƴ� ��
 * NullPointerException : �Ű� ���� ���� null�� ��
 * IndexOutOfBoundsException : �ε��� �Ű� ���� ���� ������ ��� ��
 * ArithmeticException : ������� ���꿡 ������ ���� ��
 */

class E{
	void thorwArithmeticException() {
		throw new ArithmeticException();
	}
	
	
	// 1. try catch�� ���
	void throwIOException1() {
		try {
			throw new IOException();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	// 2. ����ڿ��� ������
	void throwIOException2() throws IOException {
		throw new IOException();
	}
}

public class ����7 {

	public static void main(String[] args) {

		

	}

}
