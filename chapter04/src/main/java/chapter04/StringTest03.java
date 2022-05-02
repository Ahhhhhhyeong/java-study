package chapter04;

import javax.swing.SwingConstants;

public class StringTest03 {

	public static void main(String[] args) {
		
		// String method...
		String s1 = "aBcABCabcAbc";
//		System.out.println(s1.length());	// s1의 길이
//		System.out.println(s1.charAt(2));	// n번째 char 출력
//		System.out.println(s1.indexOf("abc")); // 자리수 리턴
//		System.out.println(s1.indexOf("abc", 7)); // 자리수 리턴(못찾을 시 -1)
//		System.out.println(s1.substring(3)); // n번째부터 문자열출력
	
		String s2 = "  ab  cd  ";
		String s3 = "efg,hij,kln,mop,qrs";
		
		String s4 = s2.concat(s3); // s2와 s3를 이어붙임
//		System.out.println(s4);		
		
//		System.out.println("===" + s2.trim() + "===");	// 양쪽의 빈칸제거
//		System.out.println("===" + s2.replaceAll(" ", "")+"==="); // 빈칸제거
		
		String[] token1 = s3.split(",");
//		for(String s : token1) {
//			System.out.println(s);
//		}
		
		String[] token2 = s3.split(" ");
//		for(String s : token2) { // split가 이뤄지지 않는 
//			System.out.println(s);
//		}
//		
		// + String concat 연산자
		//String s5 = "Hello" + "World" + "Java" + "1.8";		
		String s5 = new StringBuffer("Hello")
				.append("World")
				.append("Java")
				.append(1.8).toString();
		
//		System.out.println(s5);
		
		String s6 = "";
//		for(int i = 0; i < 100000; i++) {
//			s6 = s6 + i;
//			s6 = new StringBuffer(s6).append(i).toString();
//		}
		
		StringBuffer sb6 = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			// 위에 for문안에서 new 연산자를 돌리는 것 보다
			// 미리 new 객체를 만들어 append를 시키는게 좋다.
			sb6.append(i);
		}
		
		String s7 = sb6.toString();
//		System.out.println(s7.length());
		
	}

}
