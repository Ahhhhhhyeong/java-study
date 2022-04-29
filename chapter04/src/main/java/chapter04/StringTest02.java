package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		// immutability (불변성)
		String s1 = "abc" ;
		String s2 = "def";
		String s3 = s2;
		 
		s2 = s1.toUpperCase();			// 대문자 치환
		
		String temp = "??";
		String s4 = s2.concat(temp);	// 문자열 이어줌
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println(equlsHello(null));
	}
	
	private static boolean equlsHello(String s) {
		return "hello".equals(s);
	}

}
