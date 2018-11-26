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
		try {
			System.out.println("请输入一个格式化的日期（例如：2018-11-25）：");
			Scanner scanner = new Scanner(System.in);
			String temp = scanner.nextLine();
			DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
			// 获取输入的数据
			Date dDate = dFormat.parse(temp);
			Calendar calendar1 = new GregorianCalendar();
			// 设定日期
			calendar1.setTime(dDate);
			// 获取当天日期
			int day = calendar1.get(Calendar.DATE);
			// 获取本月1号为周几
			calendar1.set(Calendar.DATE, 1);
			int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK);
			// 获取本月的最大天数
			int maxDay = calendar1.getActualMaximum(Calendar.DATE);
			// 打印周
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			// 输出1号之前的空格
			if ((dayOfWeek - 1) % 7 != 0) {
				for (int i = 0; i < dayOfWeek - 1; i++) {
					System.out.print("\t");
				}
			}
			// 打印日历
			for (int i = 1; i <= maxDay; i++) {
				// 打印到输入的日期时在日期后面加上星号
				if (i == day) {
					System.out.print(i + "*\t");
					// 打印到星期六就换行
				} else if ((i + dayOfWeek - 1) % 7 == 0) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + "\t");
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
