//12.4 �����Զ�����쳣
//
package twelve;
import static utils.Print.*;
//Ĭ�Ϲ�����
class Eexception extends Exception{}
public class SimpleException {
	public void f() throws Eexception{
		printLn("Throw SimpleExeption from f()");
		throw new Eexception();
	}
	public static void main (String[] args) {
		SimpleException sed=new SimpleException();
		try {
			sed.f();
		}catch(Eexception e) {
			printLn("caught it!");
		}
	}
}
