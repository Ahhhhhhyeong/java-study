package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			int firstNum = i % 10; // 1의자리만 구하기
			int secondNum = (int)Math.floor(i / 10);	 // 10의 자리만 구하기
		
				
			StringBuilder text = new StringBuilder();
			if(firstNum == 3 ||firstNum == 6 || firstNum == 9) {
				text.append("짝");
			}
			if(secondNum == 3 ||secondNum == 6||secondNum == 9) {
				text.append("짝");
			}		
			
			if(!text.toString().equals("")) {
				System.out.printf("%d %s\n", i, text);
			}
		}
	}
}
