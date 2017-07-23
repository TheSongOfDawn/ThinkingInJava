//面试代码题题2
public class ms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f());
		
	}
	static boolean f() {
		try {
//			System.out.println("try中....");
//			System.exit(0); 如果程序中断了，就只会执行到这里不会进行下一步
			return true;

		} finally {
			System.out.println("finally中....");
			return false;
		}
	}
}
/*output
 * false
 * 因为finally只要不中断程序就一定会执行。。。。  
 *栈中先放入true,然后栈中再放入false,然后就返回栈中的第一个了  
 * 
 * Return并不是让函数马上返回
 * 而是return语句执行后，
 * 将把返回结果放置进函数栈中，
 * 此时函数并不是马上返回，
 * 它要执行finally语句后才真正开始返回。
 * */
