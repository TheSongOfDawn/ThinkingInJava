//��ķ���Ȩ��
//�μ� ��������Լ���д��Ĭ�ϵĹ����� ��ô�Ͳ����Զ���������
//�����ù���������Ϊprivate ��˭Ҳ�޷���������Ķ���
//����ʹ�÷�������ʾ���ӣ�1.��Soup1�У�����һ��static������������һ���µ�Soup1���󲢷��ض���������
//				  2.Soup2�õ������ģʽ Singleton������������Աʼ��ֻ�ܴ�������һ������
//					��ΪSoup2��Ķ�������ΪSoup2��һ��static private��Ա�������� ��������ֻ��
//					һ�� ��ֻ��ͨ��public ��access()�������ʵ���
class Soup1{
	private Soup1() {}
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2{
	private Soup2() {}
	private static Soup2 ps1=new Soup2();
	public static Soup2 accesss() {
		return ps1;
	}
	public void f() {} 
}


public class Lunch {

	void testPrivate() {
		//����ʹ��soup1��˽�й��췽��
		//Soup1 soup=new Soup1();
	}
	void testStatic() {
		Soup1 soup=Soup1.makeSoup();
	}
	void testSingleton() {
		Soup2.accesss().f();
	}
}
