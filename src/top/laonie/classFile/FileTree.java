package top.laonie.classFile;

import java.io.File;

public class FileTree {

	public static void main(String[] args) {
		File file = new File("/Volumes/SoftWare/电影");
		printFile(file, 0);
	}

	/**
	 * 通过递归算法 打印磁盘目录树
	 * 
	 * @param file
	 * @param level
	 */
	static void printFile(File file, int level) {
		// 打印文件分隔符
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		// 输出文件名
		System.out.println(file.getName());
		// 打印子目录
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File temp : files) {
				printFile(temp, level + 1);
			}

		}
	}

}
