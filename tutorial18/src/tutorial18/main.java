package tutorial18;

public class main extends player {

	public static void main(String[] args) {
		
		

	}

	@Override
	void play(String songName) {
	
		System.out.println(songName + "���� ����մϴ�");
	}

	@Override
	void pause() {
		System.out.println("���� �Ͻ������մϴ�");
		
	}

	@Override
	void stop() {
		
		System.out.println("���� �����մϴ�");
		
	}

}
