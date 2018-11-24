package zuoye;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);

	public Clock(int hour, int minute, int second) {
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
	}

	public void tick() {
//		停顿一秒
//		while (true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		second.increase();
		if (second.getValue() == 0) {
			minute.increase();
			if (minute.getValue() == 0) {
				hour.increase();
			}
		}
//		}
	}

	public String toString() {
		String str = String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(), second.getValue());
		return str;
	}

}

class Display {
	private int value;
	private int limit;

	public Display(int limit) {
		this.limit = limit;
	}

	public boolean increase() { // 时间增加的函数
		value++;
		if (value == limit) {
			value = 0;
			return true;
		} else {
			return false;
		}
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}