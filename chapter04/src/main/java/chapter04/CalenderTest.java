package chapter04;

import java.time.Month;
import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance(); // new 사용이 안됨
		
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 11); //12
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2022, 5, 2);
		cal.add(Calendar.DATE, -1409);
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS = {"일","월","화","수","목","금","토"};
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1(sun) ~ 7(sat)
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(
				year + "-" + 
				((month < 9) ? "0" : "") + (month + 1) + "-" +
				((date < 10) ? "0" : "")+ date +
				DAYS[day - 1] + "요일" +
				" " +
				hour + ":" + 
				min + ":" +
				(sec < 10 ? "0" : "") + sec 
		);
	}

}
