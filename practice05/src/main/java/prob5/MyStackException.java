package prob5;

public class MyStackException extends RuntimeException {
	MyStackException(){	
		super("stack is empty");
	}
	
	MyStackException(String message){
		super(message);
	}
}
