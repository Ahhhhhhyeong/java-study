package prob02;

public class Sub implements Arithmetic {
	public Sub() {
	}

	@Override
	public int calculate(int a, int b) {
		int result = a - b;
		return result;
	}

}
