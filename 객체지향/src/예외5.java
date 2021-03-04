import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//예외 던지기 예외란 일종의 폭탄이다. 자기 자신이 처리할 수 있고, 남에게 던져줄 수 있다.

//class X는 최초사용자.
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

public class 예외5 {

	public static void main(String[] args) {
		
		
		//위 상위 클래스에서 사용자까지 throw즉, 던지기를 했기 떄문에 오류를 사용자가 잡아야한다.
		
		Y a = new Y();
		try {
			a.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
}