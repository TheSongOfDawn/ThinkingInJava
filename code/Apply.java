//��ȫ����
//�������� ����һ���ܸ���������������Ĳ�ͬ�����в�ͬ��Ϊ�ķ��� ��Ϊ�������ģʽ
import static utils.Print.*;

import java.util.Arrays;

class Processor{
	public String name() {	 
		return getClass().getSimpleName();//��õ�ǰ�������� ����Դ�����и����ĵײ���ļ�ơ�	
	}
	Object process(Object input) {return input;}
}

class Upcase extends Processor{
	String process(Object input) {
		return ((String)input).toUpperCase();//��������ַ��������ַ�ת���ɴ�д
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
