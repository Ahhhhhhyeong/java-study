package prob3;

import java.util.Scanner;

public class Prob3 {
	public static int oddEvenMethod(int value) {
		if(value % 2 == 0) {
			return 2;
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		for(int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scanner.nextInt();
			int oddEven = oddEvenMethod(num);
			int result = 0;
			for(int j = oddEven; j <= num; j+=2) {
				result += j;
			}
			System.out.printf("결과값 : %d \n", result);
		}
		
		scanner.close();
	}
	
	
}
