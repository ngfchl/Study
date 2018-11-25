package wapper;

public class Test01 {
/**
 * 自动装箱拆箱，基础数据类型包装类
 * @param args
 */
	public static void main(String[] args) {
		//装箱
		Integer a = 1500;//Integer a = new Ineger(1500);
		Double d = 10.0;
		//拆箱
		int c = new Integer(1500);//int c = b.intValue();
		System.out.println(a==c);
		Integer b = 1500;
		Integer e = 128;//【-128-127】之间的数字仍然当做基本数据类型来处理，以提高效率 
		System.out.println(a==b);
		System.out.println(a*d);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
	}

}
