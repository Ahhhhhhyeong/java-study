package prob2;

public class MusicPhone extends Phone{
	public void execute (String function) {
		if("음악".equals(function)) {
			playMusic();
			return;
		}
		
		super.execute(function);
	}

	protected void playMusic() {
		System.out.println("MP3 플레이어에서 음악재생");		
	}
}
