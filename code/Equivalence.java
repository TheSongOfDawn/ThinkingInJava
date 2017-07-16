
public class Equivalence {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Integer n1=new Integer(47);
//		Integer n2=new Integer(47);
//		System.out.println(n1==n2);
//		System.out.println(n1!=n2);
//	}
	/*output 
	 * false
	 * true
	 * 原因 ==和！=鬓角的就是对象的引用 ，尽管对象内容相同，但是对象的引用不同
	 * 解决 使用对所有对象都使用的equals()，但这种方法不适用于基本类型 基本类型直接使用==和！=即可
	 * */

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Integer n1=new Integer(47);
//		Integer n2=new Integer(47);
//		System.out.println(n1.equals(n2));
//		/*output
//		 * true
//		 * 因为Integer中覆盖写了equals()方法 直接比较的值 可以点进Integer这个类中去看一看
//		 * */		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*当我把value这个类写在当前Equivalence这个类里面时会报错 改出去就没有下面的错误了
		 * No enclosing instance of type Equivalence is accessible. 
		 * Must qualify the allocation with an enclosi
		 * 
		 * 
		 * */
		Value v1=new Value();
		Value v2=new Value();
		v1.i=v2.i=100;
		
		System.out.println(v1.equals(v2));
		/*output
		 * false
		 * 因为Integer中覆盖写了equals()方法 直接比较的值 可以点进Integer这个类中去看一看
		 *但是我自己写的类没有覆盖equals()这个方法 所以输出为false
		 * equals()方法2的默认行为使比较引用 所以除非我们覆盖该方法 否则不可能表现出我们希望的行为
		 * */		
	}
	

}	
class Value{
	int i;
}
