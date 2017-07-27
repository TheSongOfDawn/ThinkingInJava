//缺陷 覆盖私有方法
import static utils.Print.*;
public class PrivateOverride {

	private void f() {printLn("private f()");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride po=new D();
		po.f();
	}
}
class D extends PrivateOverride{
	public void f() {printLn("public f()");}
}
/*output:
 * private f()
	private 方法被自动认为是final方法
 * */
