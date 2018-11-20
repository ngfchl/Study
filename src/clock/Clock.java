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
//走秒
			second.increase();
			if (second.getValue() == 0) {
				// 走分
				minute.increase();
				if (minute.getValue() == 0) {
					// 走小时
					hour.increase();
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
		return hour.getValue() + ":" + minute.getValue() + ":" + second.getValue();
	}

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}
