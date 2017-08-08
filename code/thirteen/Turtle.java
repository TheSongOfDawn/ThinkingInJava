//13.5.3 Formatter��
//������ĸ�ʽ���ַ��������ݷ������Ҫ�Ľ��
//���㴴��һ��Formatter�����ʱ�� ��Ҫ���乹��������һЩ��Ϣ ���������յĽ�����������
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
