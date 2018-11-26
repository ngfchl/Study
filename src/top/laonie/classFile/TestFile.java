package top.laonie.classFile;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("/Volumes/SoftWare/143.jpg");
		File file1 = new File("/Volumes/SoftWare/");
		System.out.println(file.getPath());

	}

}
