import com.sun.corba.se.spi.oa.OADefault;

//可变参数列表
class A{}
public class VarArgs {

	static void printArray(Object[] args) {
		for(Object obj:args) 
			System.out.println(obj+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Object[] {
				new Integer(47),new Float(3.14),new Double(11.11)
		});
		printArray(new Object[] {
				"one","two","three"
		});
		printArray(new Object[] {new A(),new A(),new A()});
	}
/*
 * 
 * 47 
3.14 
11.11 
one 
two 
three 
A@15db9742 
A@6d06d69c 
A@7852e922 
 * 
 * 
 * 
 * 
 * */
}
