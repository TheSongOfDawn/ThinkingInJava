/* 11 ���ж���
 * ���ͺ����Ͱ�ȫ������
 * java�����඼�����Զ��ص����Լ��ĳߴ�
 */
package eleven;

import java.util.ArrayList;
import static utils.Print.*;
class Apple{
	private static long counter;
	private final long id=counter++;
	public long id() {
		return id;
	}
}
class Oranger{}
class Gala extends Apple{}
class Fuji extends Apple{}

public class ApplesAndOrangesWithoutGenerices {

	@SuppressWarnings("unchecked")//��ʾֻ���й� �����ܼ����쳣�� ������ϢӦ�ñ�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList apples=new ArrayList();
//		for(int i=0;i<3;i++) {
//			apples.add(new Apple());
//		}
//		apples.add(new Oranger());
//		for(int i=0;i<apples.size();i++) {
//			((Apple) apples.get(i)).id();
//		}
		
		
//		ArrayList<Apple> apples=new ArrayList<Apple>();
//		for(int i=0;i<3;i++) {
//			apples.add(new Apple());
//		}
//		//����ʱ����
////		apples.add(new Oranger());
//		for(int i=0;i<apples.size();i++) {
//			System.out.println(apples.get(i).id());//����ת��Ҳ���Ǳ���� ��Ϊlist֪�����������ʲô���������ڵ���get������ʱ���Զ�������ת��
//		}
//		for(Apple a:apples) {
//			printLn(a.id());
//		}
		
		//����ת��Ҳ���������ڷ���
		
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new Gala());
		apples.add(new Apple());
		apples.add(new Fuji());
		for(Apple a:apples) {
			printLn(a.id());
		}
		
	}
}
/*��Ϊarraylist�ౣ�����object����� ���Բ����������apple ���������oranger��
 * 
 * ʹ��get����ʱ �õ���ֻ��object������ ���뽫��ת��ΪApple ����ʱ���һ������
 * Exception in thread "main" java.lang.ClassCastException: eleven.Oranger cannot be cast to eleven.Apple
	at eleven.ApplesAndOrangesWithoutGenerices.main(ApplesAndOrangesWithoutGenerices.java:29)
 * 
 * */

