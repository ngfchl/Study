package testDateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test01 {
	/**
	 * 可视化日历程序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("请输入一个格式化的日期（例如：2018-11-25）：");
		Scanner scanner = new Scanner(System.in);

		String temp = scanner.nextLine();
		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dDate = dFormat.parse(temp);
			Calendar calendar1 = new GregorianCalendar();
			calendar1.setTime(dDate);
			calendar1.set(Calendar.DATE, 1);
			int a = calendar1.get(Calendar.DAY_OF_WEEK);
			int b = calendar1.get(Calendar.DATE);
			int c = calendar1.getActualMaximum(Calendar.DATE);
			System.out.println(a);
			System.out.println(c);

			System.out.println("日\t一\t二\t三\t四\t五\t六");
			if ((a - 1) % 7 != 0) {
				for (int i = 0; i < a - 1; i++) {
					System.out.print("\t");
				}
			}
			for (int i = 1; i <= c; i++) {
				System.out.print(i + "\t");
				if(i==b) {
					System.out.print("*");
				}
				
				if ((i + a - 1) % 7 == 0) {
					System.out.println();
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
