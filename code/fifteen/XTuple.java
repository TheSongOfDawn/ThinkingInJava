/*15.2.1 一个元祖类
 * 
 * 元祖 将一组对象直接打包存储于其中一个单一对象 这个容器对象允许读取其中元素 但不允许向其中存放新的对象
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

//相同的 可以再定义4个类型参数继承3个类型参数的类
//测试类
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
