
public class Equivalence {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Integer n1=new Integer(47);
//		Integer n2=new Integer(47);
//		System.out.println(n1==n2);
//		System.out.println(n1!=n2);
//	}
	/*output 
	 * false
	 * true
	 * ԭ�� ==�ͣ�=�޽ǵľ��Ƕ�������� �����ܶ���������ͬ�����Ƕ�������ò�ͬ
	 * ��� ʹ�ö����ж���ʹ�õ�equals()�������ַ����������ڻ������� ��������ֱ��ʹ��==�ͣ�=����
	 * */

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Integer n1=new Integer(47);
//		Integer n2=new Integer(47);
//		System.out.println(n1.equals(n2));
//		/*output
//		 * true
//		 * ��ΪInteger�и���д��equals()���� ֱ�ӱȽϵ�ֵ ���Ե��Integer�������ȥ��һ��
//		 * */		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*���Ұ�value�����д�ڵ�ǰEquivalence���������ʱ�ᱨ�� �ĳ�ȥ��û������Ĵ�����
		 * No enclosing instance of type Equivalence is accessible. 
		 * Must qualify the allocation with an enclosi
		 * 
		 * 
		 * */
		Value v1=new Value();
		Value v2=new Value();
		v1.i=v2.i=100;
		
		System.out.println(v1.equals(v2));
		/*output
		 * false
		 * ��ΪInteger�и���д��equals()���� ֱ�ӱȽϵ�ֵ ���Ե��Integer�������ȥ��һ��
		 *�������Լ�д����û�и���equals()������� �������Ϊfalse
		 * equals()����2��Ĭ����Ϊʹ�Ƚ����� ���Գ������Ǹ��Ǹ÷��� ���򲻿��ܱ��ֳ�����ϣ������Ϊ
		 * */		
	}
	

}	
class Value{
	int i;
}
