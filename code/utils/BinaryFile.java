//18�¶�ȡ�������ļ�

package utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {

	public static byte[] read(File bFile) throws IOException {
		BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
		try {
			byte[] data = new byte[bf.available()];
			bf.read(data);
			return data;
		} finally {
			bf.close();
		}
	}

	public static byte[] read(String bFile) throws IOException {
		System.out.println(bFile);
		return read(new File(bFile).getAbsoluteFile());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
