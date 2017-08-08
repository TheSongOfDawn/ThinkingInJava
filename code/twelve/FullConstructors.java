//12.4 FullConstructors


package twelve;

class MyExeception extends Exception {
	public MyExeception() {
	}

	public MyExeception(String msg) {
		super(msg);
	}
}
public class FullConstructors {
	public static void f() throws MyExeception {
		System.out.println("Throwing MyException from f()");
		throw new MyExeception();
	}

	public static void g() throws MyExeception {
		System.out.println("Throwing MyException from g()");
		throw new MyExeception("originated in g()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (MyExeception e) {
			//如果去掉System.out 则信息会被输出到标准错误流
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyExeception e) {
			e.printStackTrace(System.out);
		}
	}
}
/*
 * Throwing MyException from f()
twelve.MyExeception
	at twelve.FullConstructors.f(FullConstructors.java:16)
	at twelve.FullConstructors.main(FullConstructors.java:27)
Throwing MyException from g()
twelve.MyExeception: originated in g()
	at twelve.FullConstructors.g(FullConstructors.java:21)
	at twelve.FullConstructors.main(FullConstructors.java:32)
 * 
 * */
