//可以调用内部类的方法
import static utils.Print.*;

public class Test20170728 {
	private int a=0; 
	public TestB makeTestB() {
		return new TestB();
	}
	private void Test20170728privateMethod() {
		printLn("Test20170728privateMethod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test20170728 t=new Test20170728();
		
		//No enclosing instance of type Test20170728 is accessible. 
		//Must qualify the allocation with an enclosing instance of type Test20170728 
		//(e.g. x.new A() where x is an instance of Test20170728).
		//Test20170728.TestB tb=new Test20170728.TestB();
		
	//	Test20170728.TestB tb=t.new TestB(); this is ok!!
		
		Test20170728.TestB tb=t.makeTestB();
		
		tb.privateMethod();
		tb.publicMethod();
		tb.protectedMethod();	
		
		/*OUTPUT:
		 * privateMethod()
		 * publicMethod()
		 * protectedMethod()
		 * */
	}
	private class TestB{
		private int b=1;
		private void privateMethod() {
			printLn("privateMethod()");
		}
		public void publicMethod() {
			printLn("publicMethod()");
		}
		protected void protectedMethod() {
			printLn("protectedMethod()");
		}
	}

}
/*
 * 
 Illegal modifier for the class TestB; 
 only public, abstract & final are permitted
private class TestB{
	
}
*/