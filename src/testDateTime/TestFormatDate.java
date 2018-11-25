package testDateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormatDate {

	public static void main(String[] args) {
		//时间格式化输出
		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss 第w周");
		Date d= new Date(2222221222222L);
		//给定的时间戳转化为时间
		String string = dFormat.format(d);
		System.out.println(string);
		//指定的日期转化
		String str ="1989-03-10";
		DateFormat dFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d2=dFormat2.parse(str);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
