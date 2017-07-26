//类的访问权限
//牢记 如果我们自己编写了默认的构造器 那么就不会自动创建它了
//若将该构造器设置为private 就谁也无法创建该类的对象
//两种使用方法，演示例子：1.在Soup1中，创建一个static方法，它创建一个新的Soup1对象并返回对它的引用
//				  2.Soup2用到了设计模式 Singleton单例，开发人员始终只能创建它的一个对象
//					因为Soup2类的对象是作为Soup2的一个static private成员而创建的 所以有且只有
//					一个 且只能通过public 的access()方法访问到它
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
		//不能使用soup1的私有构造方法
		//Soup1 soup=new Soup1();
	}
	void testStatic() {
		Soup1 soup=Soup1.makeSoup();
	}
	void testSingleton() {
		Soup2.accesss().f();
	}
}
