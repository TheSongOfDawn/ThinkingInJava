package utils;

import java.io.PrintStream;

public class Print {

	// 输出并换行
	public static void printLn(Object obj) {
		System.out.println(obj);
	}

	// 换行
	public static void printLn() {
		System.out.println();
	}

	// 输出不换行
	public static void print(Object obj) {
		System.out.print(obj);
	}

	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

}
