package chapter04;

public class MyClass {
	// 싱글톤
	private static MyClass instance = null;
	
	private MyClass() {}
	
	
	public static MyClass getInstance() {
		if(instance == null) {
			instance  = new MyClass();
		}
		return instance;
	}
	
}
