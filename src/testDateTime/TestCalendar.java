package testDateTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	/**
	 * 测试日历
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar calendar1 = new GregorianCalendar();
//		calendar1.set(1989, 03, 10, 5, 55);
//		Date date1=calendar1.getTime();
		calendar1.set(Calendar.YEAR, 1989);
		calendar1.set(Calendar.MONTH, 2);
		calendar1.set(Calendar.DATE, 19);
		Date date2 = calendar1.getTime();
//		System.out.println(date1);
		System.out.println(date2);
		//日起计算
		calendar1.add(Calendar.DATE, 20);
		Date date3 = calendar1.getTime();
		System.out.println(date3);

	}

}
