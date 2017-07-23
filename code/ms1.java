//面试中遇到的一个代码题
public class ms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer f1=100,f2=100,f3=150,f4=150;
		
		System.out.println(f1==f2);
		System.out.println(f3==f4);
	}
	/*output:
	 * true
	 * false
	 * 
	 * 1.==在比较对象类型的时候是比较地址值的
	 * 2.Integer有一个常量池在-128~127的时候，
	 * 生成的Integer对象是同一个地址值，所以为true
	 * 当超过这个范围产生的就是不同的对象，所以用==比较为false
	 * */
}
