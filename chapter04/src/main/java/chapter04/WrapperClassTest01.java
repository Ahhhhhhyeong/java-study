package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(10); 		// 밑줄: deprecated
		Character c = new Character('C');  // 밑줄: deprecated
		Boolean b = new Boolean(true);		// 밑줄: deprecated
		
		// Auto Boxing
		Integer j1 = 10;
		Integer j2 = 10;
		
		System.out.println(j1 == j2);
		System.out.println(j1.equals(j2));
		
		
		// Auto Unboxing
		int m1 = j1 + 10;
		int m2 = j1.intValue() + 10;	// 본래 문법
		
	}

}
