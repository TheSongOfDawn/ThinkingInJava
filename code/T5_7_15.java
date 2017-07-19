/*5.6 总结一下对象的创建过程，假设名为Dog的类
 * 1.计时没有显示的使用static关键字，构造器实际上也是静态方法。
 * 因此，当首次创建类型为Dog的对象时，或者Dog类的静态方法/静态域首次被访问时，
 * java解释器必须查找路径，以定位Dog.class
 * 2.然后载入Dog.class 有关静态初始化的所有动作都会执行。音痴，静态初始化只在Class对象
 * 首次加载时候进行一次
 * 3. 当用new Dog()创建对象的时候，首先将在堆上为Dog对象分配足够的存储空间
 * 4.这块存储空间会被清零，自动将Dog类对象中所有基本类型设置成为默认值，而引用则会被
 * 设置成null
 * 5.执行所有出现于字段定义出的初始化动作
 * 6.执行构造器
 * 5.7.4非静态实例初始化
 * 用来初始化每个对象的非静态变量
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
		System.out.println("Mugs() 完成");
		new Mugs(1);
		System.out.println("Mugs(1) 完成");
	}
}
/*output:
 * mainIn
Mug(1)
Mug(2)
m1 & m2 initialized
mugs()
Mugs() 完成
Mug(1)
Mug(2)
m1 & m2 initialized
mugs(int)
Mugs(1) 完成
 * 
 * 
 * 
 * 
 * */
