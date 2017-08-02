/*14 Class����
 * �ؼ��ʣ�RTTI Class����
 * ������Ϣ������ʱ��α�ʾ�ġ�����������ɳ�Ϊ Class��������������ɵ� �������������йص���Ϣ ��
 * Class���������������������г���Ķ��� Javaʹ��Class������ִ��RTTI
 * ÿ���඼��һ��Class����ÿ����д���ұ�����һ������ �ͻ����һ��Class���� Ϊ�����������Ķ��� ������������java�������ʹ��
 *  ������� ����ϵͳ����ϵͳʵ���Ͽ��԰���һ����������� ��ֻ��һ�� ԭ����������������ص�����ν�Ŀ����� ����JavaAPI�� ����ͨ���Ǵӱ��ؼ��صģ� 
 * �����඼���ڶ����һ��ʹ��ʱ ��̬���ص�jvm�е� ����� ����������ʼ����֮ǰ������ȫ���� ������������ڱ���ʱ�ż��ص�
 * 
 * ����������ȼ��������Class�����Ƿ��Ѿ����� �����δ���� Ĭ�ϵ������
 * �ͻ������������.class�ļ� ���������ֽ��뱻����ʱ �������֤ ��ȷ����û�б��ƻ� ����û�в���java����
 * 
 * һ��ĳ�����Class���������ڴ棬���ͱ������������������ж���
 * 
 * 
 * exp:
 * */
package fourteen;

import static utils.Print.*;

class Candy {
	static {
		printLn("Loading candy");
	}
}

class Gum {
	static {
		printLn("Loading Gum");
	}
}

class Cookie {
	static {
		printLn("Loading Cookie");
	}
}

public class SweetShop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLn("begin main()");
		new Candy();
		printLn("After Creating Candy");
		try {
			//������������fourteen���������� �ͱ���Ѱ���Ҳд�� ��Ȼ�Ҳ�����
			Class.forName("fourteen.Gum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			printLn("Couldnt find Gum");
		} 
		printLn("After class.forName(\"Gum\")");
		new Cookie();
		printLn("After Creating Cookie");
	}
}
/*output��
	begin main()
	Loading candy
	After Creating Candy
	Couldnt find Gum
	After class.forName("Gum")
	Loading Cookie
	After Creating Cookie
 * 
 * */
