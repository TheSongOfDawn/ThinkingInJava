/*14.2.1 �����泣��
 * ���ɶ�class���������  ����c=Class.forName("fourteen.FancyToy");
 * ʹ�������泣�� exp Fancy.class
 * 	������ ��ͨ���� ���ӿ� ���� �Լ�������������
 * 
 * */

package fourteen;

import java.util.*;
import static utils.Print.*;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		printLn("��ʼ�� Initable");
	}
}
class Initable2 {
	static final int staticNonFinal = 147;
	static {
		printLn("��ʼ�� Initable2");
	}
}
class Initable3 {
	static final int staticNonFinal = 74;
	static {
		printLn("��ʼ�� Initable3");
	}
}
public class ClassInitialization {
	public static Random rand=new Random(47);
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class initable=Initable.class;
		printLn("After Creating initable ref");
		printLn(Initable.staticFinal);
		printLn(Initable.staticFinal2);
		printLn(Initable2.staticNonFinal);
		
		Class initable3=Class.forName("fourteen.Initable3");
		printLn("After creating Initable3 ref");
		printLn(Initable3.staticNonFinal);
	}
}
/* output:
After Creating initable ref
47
��ʼ�� Initable
258
147
��ʼ�� Initable3
After creating Initable3 ref
74
*/




