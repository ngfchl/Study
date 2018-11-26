package top.laonie.error;

public class TestException {

	public static void main(String[] args) {
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// int x = 1 / 0;异常运算条件，除数不能为0
		Computer computer = null;
		/*
		 * 空指针异常，通常是对象为null，然后调用了对象的方法和属性！ Exception in thread "main"；
		 * 解决方法：对对象做判断，对象不是null在继续运行！ java.lang.NullPointerException;
		 * 
		 * @if (computer !=null){ computer.start(); }
		 */
	}

	class Computer {
		void start() {
			System.out.println("Start!");
		}
	}
}
