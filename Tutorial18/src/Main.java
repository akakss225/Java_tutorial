
public class Main extends �߻� {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.play("Joakim Karud - Might Love");
		main.pause();
		main.stop();


	}
	
	@Override
	void play(String songName) {
		System.out.println(songName + " ���� ����մϴ�.");
		
	}
	
	@Override
	void pause() {
		System.out.println("���� �Ͻ������մϴ�.");
	}
	
	@Override
	void stop() {
		System.out.println("���� �����մϴ�.");
	}

}
