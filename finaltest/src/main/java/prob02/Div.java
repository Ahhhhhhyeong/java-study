package prob02;

public class Div implements Arithmetic {
	public Div() {
	}

	@Override
	public int calculate(int a, int b) {
		int result = a / b;
		return result;
	}

}
