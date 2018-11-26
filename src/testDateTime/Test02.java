package testDateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test02 {
	/**
	 * 扩展可视化日历程序 打印个人值班表，显示上下班日期 特定用途
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// 获取当天日期
			Date cDate = new Date();
			// 设定日期格式
			DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
			String today = dFormat.format(cDate);
			// 设定上班日期
			System.out.println("请输入上班日期（今天：0，明天：1，后天：2）：");
			Scanner scanner = new Scanner(System.in);
			int temp = scanner.nextInt();
			// 获取输入的数据
			Date dDate = dFormat.parse(today);
			Calendar calendar1 = new GregorianCalendar();
			// 设定日期
			calendar1.setTime(dDate);
			// 获取当天日期
			int day = calendar1.get(Calendar.DATE);
//			System.out.println(day);
			calendar1.add(Calendar.DATE, temp - 1);
			int dayOfWork = calendar1.get(Calendar.DATE);
			System.out.println(dayOfWork);
			// 获取本月1号为周几
			calendar1.set(Calendar.DATE, 1);
			int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK);
			// 获取本月的最大天数
			int maxDay = calendar1.getActualMaximum(Calendar.DATE);
			// 打印周
			System.out.println(calendar1.getTime());
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			// 输出1号之前的空格
			if ((dayOfWeek - 1) % 7 != 0) {
				for (int i = 0; i < dayOfWeek - 1; i++) {
					System.out.print("\t");
				}
			}
			// 打印日历
			for (int i = 1; i <= maxDay; i++) {

				// 打印到输入的日期时在日期后面加上@

				if (i == day) {
					System.out.print(i + "@\t");
					// 打印到星期六就换行
				} else {
					System.out.print(i + "\t");
				}
				// 上班那天加上上班，下班加上回家
				if (i >= dayOfWork && (i - dayOfWork) % 4 == 0) {
					System.out.print("上班.");

				} else if (i >= dayOfWork && (i - dayOfWork) % 2 == 0) {
					System.out.print("回家.");
				}
				if ((i + dayOfWeek - 1) % 7 == 0) {
					System.out.println("\n");
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
