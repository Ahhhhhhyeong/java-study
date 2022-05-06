package thread;

public class ThreadEx02 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		Thread thread2 = new AlphabetThread();
		
		thread.start();
		thread2.start();
		
	}

}
