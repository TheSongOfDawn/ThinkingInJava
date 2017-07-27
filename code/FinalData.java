//final关键字-》final 数据
import static utils.Print.*;

/*final 数据 一个永不改变的编译时常量
 * 		一个在运行时被初始化的值，而你不希望它被改变
 * 		对于基本类型 final使数值恒定不变 而对于对象引用 final使引用恒定不变
 * 
 * 空白 final 比如在
 * calss blank{
 * 	private final int j;//blank final
 * public blank(){
 * 		j=1;
 * }
 * 
 * }//必须在域的定义处或者每个构造器中用表达式对final进行赋值
 * */
import java.util.Random;
//Value 在默认包里已经有这个Value类了 是包访问权限 
class Value1{
	int i;//包访问权限
	public Value1(int i) {
		this.i=i;
	}
}

public class FinalData {
	public static Random rand=new Random(47);
	
	private String id;
	public FinalData(String id) {this.id=id;}
	private final int valueOne=9;
	private  static final int VALUE_TWO=99;
	//定义为public 则可以被用于包之外，定义为static 则强调只有一份；定义为final 一个常量
	public static final int VALUE_THREE=39;
	//不能在编译时就可以知道它的值
	private final int i4=rand.nextInt(20);
	static final int INT_5=rand.nextInt(20);
	private Value1 v1=new Value1(11);
	//不能因为v2是final的 就认为无法改变它的值
	private final Value1 v2=new Value1(22);
	private static final Value1 VAL_3=new Value1(33);
	
	//数组
	private final int[] a = {1,2,3,5,6};
	public String toString() {
		return id+": "+"i4 = "+i4+",INT_5= "+INT_5;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalData fd1=new FinalData("fd1");
		
		fd1.v2.i++;
		fd1.v1=new Value1(9);
		for(int i=0;i<fd1.a.length;i++)
			fd1.a[i]++;
		printLn(fd1);
		printLn("Creating new FinalData");
		FinalData fd2=new FinalData("fd2");
		printLn(fd1);
		printLn(fd2);
	}

}
