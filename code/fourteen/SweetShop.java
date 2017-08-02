/*14 Class对象
 * 关键词：RTTI Class对象
 * 类型信息在运行时如何表示的。这个工作是由称为 Class对象的特殊对象完成的 它包含了与类有关的信息 。
 * Class对象就是用来创建类的所有常规的对象 Java使用Class对象来执行RTTI
 * 每个类都有一个Class对象。每当编写并且编译了一个心累 就会产生一个Class对象 为了生成这个类的对象 运行这个程序的java虚拟机将使用
 *  类加载器 的子系统。该系统实际上可以包含一条类加载器链 但只有一个 原生类加载器（它加载的是所谓的可信类 包括JavaAPI类 它们通常是从本地加载的） 
 * 所有类都是在对其第一次使用时 动态加载到jvm中的 。因此 程序在它开始运行之前并非完全加载 其各个部分是在必需时才加载的
 * 
 * 类加载器首先检查这个类的Class对象是否已经加载 如果尚未加载 默认的类加载
 * 就会根据类名查找.class文件 在这个类的字节码被加载时 会接受验证 以确保其没有被破坏 并且没有不良java代码
 * 
 * 一旦某个类的Class对象被载入内存，它就被用来创建这个类的所有对象
 * 
 * 
 * exp:
 * */
package fourteen;

import static utils.Print.*;

class Candy {
	static {
		printLn("Loading candy");
	}
}

class Gum {
	static {
		printLn("Loading Gum");
	}
}

class Cookie {
	static {
		printLn("Loading Cookie");
	}
}

public class SweetShop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLn("begin main()");
		new Candy();
		printLn("After Creating Candy");
		try {
			//这里这个类放在fourteen这个包下面的 就必须把包名也写上 不然找不到的
			Class.forName("fourteen.Gum");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			printLn("Couldnt find Gum");
		} 
		printLn("After class.forName(\"Gum\")");
		new Cookie();
		printLn("After Creating Cookie");
	}
}
/*output：
	begin main()
	Loading candy
	After Creating Candy
	Couldnt find Gum
	After class.forName("Gum")
	Loading Cookie
	After Creating Cookie
 * 
 * */
