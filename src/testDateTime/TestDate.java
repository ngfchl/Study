package testDateTime;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date aDate = new Date(2229198903100L);
		Date bDate = new Date(1989, 03, 10);
		Date cDate = new Date();
		System.out.println(cDate);
		System.out.println(aDate);
		System.out.println(bDate);
		System.out.println(System.currentTimeMillis());
		boolean a = aDate.getTime() < bDate.getTime();
		boolean b = aDate.equals(bDate);
		System.out.println(a);
		System.out.println(b);
	}

}
