//完全解耦
//像本例这样 创建一个能根据所传参数对象的不同而具有不同行为的方法 成为策略设计模式
import static utils.Print.*;

import java.util.Arrays;

class Processor{
	public String name() {	 
		return getClass().getSimpleName();//获得当前对象类型 返回源代码中给出的底层类的简称。	
	}
	Object process(Object input) {return input;}
}

class Upcase extends Processor{
	String process(Object input) {
		return ((String)input).toUpperCase();//将输入的字符串所有字符转化成大写
	}
}
class Downcase extends Processor{
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor{
	@Override
	String process(Object input) {
		// TODO Auto-generated method stub
		return Arrays.toString(((String)input).split(" "));
	}
	
}
public class Apply {
	public static void process(Processor p,Object s) {
		printLn("Using Processor "+p.name());
		printLn(p.process(s));
	}
	public static String s ="Disagreement with beliefs is by definition incorrect";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
		
	}

}
