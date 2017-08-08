//13.5.3 Formatter类
//它将你的格式化字符串与数据翻译成需要的结果
//当你创建一个Formatter对象的时候 需要向其构造器传递一些信息 告诉它最终的结果向哪里输出
package thirteen;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
	private String name;
	private Formatter f;
	public Turtle(String name,Formatter f) {
		this.name=name;
		this.f=f;
	}
	public void move(int x,int y) {
		f.format("%s the turtle is at (%d,%d)\n", name,x,y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream outAlias =System.out;
		Turtle terry=new Turtle("Tommy", new Formatter(System.out));
		Turtle tommy=new Turtle("terry", new Formatter(outAlias));
		terry.move(0, 0);
		tommy.move(4, 8);
		
		terry.move(3,4);
		tommy.move(2,5);
		
		terry.move(3,3);
		tommy.move(3,3);
	}

}
