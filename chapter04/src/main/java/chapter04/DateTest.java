package chapter04;

import java.awt.print.Printable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		printDate01(now);		
		printDate02(now);
	}

	private static void printDate02(Date date) {
		// 년도(+1900)
		int year = date.getYear(); 
		
		// 월(0 ~ 11, +1)
		int month = date.getMonth();
		
		// 일
		int day = date.getDate();
		
		// 시
		int hour = date.getHours();
		
		// 분
		int min = date.getMinutes();
		
		// 초
		int sec = date.getSeconds();
		
		System.out.println(
				(year+1900) + "-" + 
				(month + 1) + "-" +
				(day) + " " +
				hour + ":" + 
				min + ":" +
				sec 
		);
	}

	private static void printDate01(Date now) {
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(now);
		
		System.out.println(date);
	}

}
