package clock;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);

//构造函数
	public Clock(int hour, int minute, int second) {
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
	}

	public void tick() {
		while (true) {
			// 停顿一秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			second.increase();// 走秒
			if (second.getValue() == 0) {
				minute.increase();// 走分
				if (minute.getValue() == 0) {
					hour.increase();// 走小时
				}
			}
			// 输出
			System.out.println(this.toString());
//			String str = this.toString();
//			System.out.println(String.format("%02s:%02S:%02s", str));
//			System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());
		}
	}

	public String toString() {
		String str = String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(), second.getValue());
		return str;
	}

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}
