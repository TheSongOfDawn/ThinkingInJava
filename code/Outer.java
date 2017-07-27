
//如果想要从外部的非静态方法之外的任意位置创建某个内部类的对象 那么必须在方法中具体指明该对象的类型
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
