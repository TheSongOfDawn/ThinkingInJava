
//�����Ҫ���ⲿ�ķǾ�̬����֮�������λ�ô���ĳ���ڲ���Ķ��� ��ô�����ڷ����о���ָ���ö��������
public class Outer {

	class Inner{}
	public Inner makeInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner i=new Outer().makeInner();
	}

}
