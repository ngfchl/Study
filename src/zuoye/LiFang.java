package zuoye;

import java.util.Scanner;

public class LiFang {

	private int a, b, c, sum = 0;

	LiFang(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public int getCl() {
		return c * c * c;
	}

	public int getSum() {
		return sum;
	}

	public boolean compare() {
		for (int i = a; i <= b; i++) {
			sum += (i * i * i);
		}
		if (sum == c * c * c) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("请输入三个整数(回车确认)：");
		Scanner s = new Scanner(System.in);
		LiFang l = new LiFang(s.nextInt(), s.nextInt(), s.nextInt());
		if (l.compare()) {
			System.out.println(
					"从" + l.getA() + "到" + l.getB() + "所有数的立方和" + l.getSum() + "等于" + l.getC() + "的立方" + l.getCl());
		} else {
			System.out.println(
					"从" + l.getA() + "到" + l.getB() + "所有数的立方和" + l.getSum() + "不等于" + l.getC() + "的立方" + l.getCl());
		}
		s.close();
//		System.out.println(Math.pow(8, 1.0/3));
	}

}
