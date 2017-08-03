//泛型语法 存储了一个类引用 又产生了一个list 填充该list的对象用newInstance()方法生成 通过该引用生成的
package fourteen;
class CountedInteger{
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return Long.toString(id);
	}
}


public class FilledList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
