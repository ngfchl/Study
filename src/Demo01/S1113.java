package Demo01;

import java.util.Scanner;

public class S1113 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入四个整数，用空格隔开：");
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5, 6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	//定义分子与坟墓
	int x, y;
	//构造函数	
	public Fraction(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//输出分数
	void print() {
		//判断分子分母
		if (y == 0) {
			System.out.println("分母不能为0");
		} else if (x == y) {
			System.out.println(1);
		} else {
			int a = x;
			int b = y;
			//最大公约数
			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			while (b % a != 0) {
				int temp = b % a;
				b = a;
				a = temp;
			}
			System.out.println(x / a + "/" + y / a);
		}
	}

	double toDouble() {
		//强制转换为double
		return x / (double) y;
	}
	//相加
	Fraction plus(Fraction r) {
		int a = r.x * y + r.y * x;
		int b = r.y * y;
		Fraction m = new Fraction(a, b);
		return m;
	}
	//相乘
	Fraction multiply(Fraction r) {
		int a = r.x* x;
		int b = r.y*y;
		Fraction m = new Fraction(a, b);
		return m;
	}
}