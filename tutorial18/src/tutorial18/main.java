package tutorial18;

public class main extends player {

	public static void main(String[] args) {
		
		

	}

	@Override
	void play(String songName) {
	
		System.out.println(songName + "곡을 재생합니다");
	}

	@Override
	void pause() {
		System.out.println("곡을 일시정지합니다");
		
	}

	@Override
	void stop() {
		
		System.out.println("곡을 정지합니다");
		
	}

}
