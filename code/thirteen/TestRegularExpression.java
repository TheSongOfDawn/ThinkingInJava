//正则表达式
package thirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.out.println("Usage:\njava TestRegularExpression" + "characterSquence regularExepression+");
			System.exit(0);
		}
		System.out.println("Input: \"" + args[0] + "\"");
		for (String arg : args) {
			System.out.println("Regular expression:\"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while (m.find()) {
				System.out.println("Match \"" + m.group() + "\"at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
	}

}
