package clock;

public class Display {
	private int value;
	private int limit;

	public Display(int limit) {
		this.limit = limit;
	}

	public void increase() {
		value++;
		if (value == limit) {
			value = 0;
		}
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		Display d = new Display(24);
		while (true) {
			d.increase();
			System.out.println(d.getValue());
		}
	}

}
