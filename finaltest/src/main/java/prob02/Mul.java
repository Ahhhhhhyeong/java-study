package prob02;

public class Mul implements Arithmetic {
	public Mul() {
	}

	@Override
	public int calculate(int a, int b) {
		int result = a * b;
		return result;
	}

}
