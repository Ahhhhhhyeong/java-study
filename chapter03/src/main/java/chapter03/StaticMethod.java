package chapter03;

import java.security.spec.MGF1ParameterSpec;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		// instance 메소드에서는 instace 변수에 접근 가능
		System.out.println(n);
	}
	
	void f2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스에서는 클래스(static)변수 접근에서는 클래스이름이 
		// 생략가능.
		System.out.println(m);
	}
	
	void f3() {
		f2();
	}
	
	void f4() {
		// 같은 클래스에서는 클래스(static)변수 접근에서는 클래스이름이 
		// 생략가능.
		s1();		
	}
	static void s1() {
		// 오류: static method 에서는 인스턴스 변수에 접근 할 수 없다.
		// System.out.println(n);
	}
	
	static void s2() {
		// 같은 클래스에서는 클래스(static)변수 접근에서는 클래스이름이 
		// 생략가능.
		System.out.println(m);
	}
	
	static void s3() {
		// error: static method에스는 인스턴스 메소드에 접근할 수 없다.
		//f1();
	}
	
	static void s4() {
		StaticMethod.s1();
		// 같은 클래스에서는 클래스(static)변수 접근에서는 클래스이름이 
		// 생략가능.
		s1();
	}
}