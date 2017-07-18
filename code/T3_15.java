/*
 * Java在进行一个浮点数转化为Int型时候，总是对改数字执行截尾操作。
 * 如果想要对数字进行四舍五入操作，就需要使用java.Math.round方法()
 * 通常 表达式中出现的最大的数据类型决定了表达式最终结果的数据类型
 * 
 * 3-16 所有数据类型在所有机器中的大小都是相同的 不必考虑一直问题。
 * */
public class T3_15 {
	public static void main(String[] args) {
		double dabove=0.7,dbelow=0.4;
		float fabove=0.7f,fbelow=0.4f;
		
		System.out.println("double1 截尾:"+(int)dabove);
		System.out.println("double2 截尾:"+(int)dbelow);
		
		System.out.println("float1 截尾:"+(int)fabove);
		System.out.println("float2 截尾:"+(int)fbelow);
		
		System.out.println("double rounde():"+Math.round(dabove));
		System.out.println("double2 rounde():"+Math.round(dbelow));
		
		System.out.println("float1 round:"+Math.round(fabove));
		System.out.println("float2 round:"+Math.round(fbelow));
		
	}
}
