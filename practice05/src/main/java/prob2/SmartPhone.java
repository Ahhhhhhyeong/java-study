package prob2;

public class SmartPhone extends Phone {
	public void execute(String function) {
		if("앱".equals(function)) {
			run();
			return;
		}
		if("음악".equals(function)) {
			playMusic();
			return;
		}

		super.execute(function);
	}
	
	private void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	protected void run() {
		System.out.println("앱실행");
	}
	
	
}
