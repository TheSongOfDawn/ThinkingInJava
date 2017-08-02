/*15.2.1 һ��Ԫ����
 * 
 * Ԫ�� ��һ�����ֱ�Ӵ���洢������һ����һ���� ����������������ȡ����Ԫ�� �������������д���µĶ���
 * 
 * 
 * */
package fifteen;

import static utils.Print.*;
class twoTuple<A,B>{
	public final A first;
	public final B second;
	public twoTuple(A a,B b) {
		first=a;
		second=b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+first+","+second+")";
	}	
}

class ThreeTuple<A,B,C> extends twoTuple<A,B>{

	public final C third;
	public ThreeTuple(A a, B b,C c) {
		super(a, b);
		// TODO Auto-generated constructor stub
		third=c;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+first+","+second+","+third+")";
	}
}

//��ͬ�� �����ٶ���4�����Ͳ����̳�3�����Ͳ�������
//������
class Am{}
class Bm{}



public class XTuple {

	static twoTuple<String,Integer> f(){
		return new twoTuple<String,Integer>("hi",47);
	}
	static ThreeTuple<Am,String,Integer> g(){
		return new ThreeTuple<Am, String,Integer>(new Am(),"hi",48);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XTuple x=new XTuple();
		printLn(x.f());
		printLn(x.g());
	}

}
