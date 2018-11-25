package top.laonie.array;

public class Foreach {
	/**
	 * foreach语句，增强的for语句，只用于方便的遍历数组（只读）
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 8, 9, 0, 4, 6, 7 };
		for (int i : a) {
			System.out.println(i);
		}
	}

}
