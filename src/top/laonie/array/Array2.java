package top.laonie.array;

public class Array2 {
	/**
	 * 打印指定矩阵（多维数组）
	 * 
	 * @param c
	 */
	public static void print(int[][] c) {
		// 打印矩阵
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * 矩阵加法
	 * 
	 * @param args
	 */
	public static int[][] add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 6 }, { 3, 4, 5 }, { 5, 7, 9 } };
		int[][] b = { { 1, 2, 6 }, { 3, 4, 5 }, { 5, 7, 9 } };
		int[][] c = add(a, b);
		print(c);
	}

}
