import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//���� ������ ���ܶ� ������ ��ź�̴�. �ڱ� �ڽ��� ó���� �� �ְ�, ������ ������ �� �ִ�.

//class X�� ���ʻ����.
class X{
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		
		
	}
}
class Y{
	void run() throws FileNotFoundException, IOException {
	X c = new X();
	c.run();
	}
}

public class ����5 {

	public static void main(String[] args) {
		
		Y a = new Y();
		try {
			a.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt ������ �ʿ��մϴ�.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
}