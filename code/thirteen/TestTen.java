//正则表达式练习10
//对于字符串 Java now has regular expressions 验证in.txt文件中的正则表达式
package thirteen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.Print.*;

public class TestTen {

	public static String[] readTextFile(String filePath) {
		StringBuilder sb = new StringBuilder();
		try {
			String encoding = "GBK";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					sb.append(lineTxt);
					sb.append(" ");
					// System.out.println(lineTxt);
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		return sb.toString().split(" ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="D:\\GitHub\\gitHubCodes\\ThinkingInJava\\code\\thirteen\\in.txt";
		String java_str="Java now has regular expressions";
		String[] list=readTextFile(filePath);
		for(String s:list) {
			printLn("Regular expression:\""+s+"\"");
			Pattern p=Pattern.compile(s);
			Matcher m=p.matcher(java_str);
			while(m.find()){
				System.out.println("Match \"" + m.group() + "\"at positions " + m.start() + "-" + (m.end() - 1));
			}
			
		}
	}

}
