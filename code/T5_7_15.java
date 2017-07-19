/*5.6 �ܽ�һ�¶���Ĵ������̣�������ΪDog����
 * 1.��ʱû����ʾ��ʹ��static�ؼ��֣�������ʵ����Ҳ�Ǿ�̬������
 * ��ˣ����״δ�������ΪDog�Ķ���ʱ������Dog��ľ�̬����/��̬���״α�����ʱ��
 * java�������������·�����Զ�λDog.class
 * 2.Ȼ������Dog.class �йؾ�̬��ʼ�������ж�������ִ�С����գ���̬��ʼ��ֻ��Class����
 * �״μ���ʱ�����һ��
 * 3. ����new Dog()���������ʱ�����Ƚ��ڶ���ΪDog��������㹻�Ĵ洢�ռ�
 * 4.���洢�ռ�ᱻ���㣬�Զ���Dog����������л����������ó�ΪĬ��ֵ����������ᱻ
 * ���ó�null
 * 5.ִ�����г������ֶζ�����ĳ�ʼ������
 * 6.ִ�й�����
 * 5.7.4�Ǿ�̬ʵ����ʼ��
 * ������ʼ��ÿ������ķǾ�̬����
 * 
 * */
class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Mugs {
	Mug m1;
	Mug m2;
	{
		m1 = new Mug(1);
		m2 = new Mug(2);
		System.out.println("m1 & m2 initialized");
	}

	Mugs() {
		System.out.println("mugs()");
	}

	Mugs(int i) {
		System.out.println("mugs(int)");
	}
}

public class T5_7_15 {
	public static void main(String[] args) {
		System.out.println("mainIn");
		new Mugs();
		System.out.println("Mugs() ���");
		new Mugs(1);
		System.out.println("Mugs(1) ���");
	}
}
/*output:
 * mainIn
Mug(1)
Mug(2)
m1 & m2 initialized
mugs()
Mugs() ���
Mug(1)
Mug(2)
m1 & m2 initialized
mugs(int)
Mugs(1) ���
 * 
 * 
 * 
 * 
 * */
