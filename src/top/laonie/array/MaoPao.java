package top.laonie.array;

import java.util.Arrays;

public class MaoPao {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 8, 9, 0, 4, 6, 7 };
		System.out.println(Arrays.toString(ascend(a)));
		System.out.println(Arrays.toString(descend(a)));
	}

	/**
	 * 冒泡升序排列
	 * 
	 * @param args
	 */
	public static int[] ascend(int[] value) {
		int temp;
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length - 1 - i; j++) {
				if (value[j] > value[j + 1]) {
					temp = value[j];
					value[j] = value[j + 1];
					value[j + 1] = temp;
				}

			}
		}
		return value;

	}

	/**
	 * 冒泡将序排列
	 * 
	 * @param value
	 * @return
	 */
	public static int[] descend(int[] value) {
		int temp;
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value.length - 1 - i; j++) {
				if (value[j] < value[j + 1]) {
					temp = value[j];
					value[j] = value[j + 1];
					value[j + 1] = temp;
				}

			}
		}
		return value;
	}
}
