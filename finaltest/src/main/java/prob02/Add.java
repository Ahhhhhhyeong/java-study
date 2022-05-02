package prob02;

public class Add implements Arithmetic {
	public Add() {
	}

	@Override
	public int calculate(int a, int b) {
		int result = a + b;
		return result;
	}

}
