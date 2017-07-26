//名词屏蔽
//虽然bart中引用了一个新的重载方法 但在bart中所有的重载方法都是可用的
//@override 注解 在不小心重载而并非覆写了该方法时 编辑器就会生成一条错误信息
import static utils.Print.*;
class Homer{
	char doh(char c) {
		printLn("doh char");
		return c;
	}
	float doh(float f) {
		printLn("doh float");
		return f;
	}
}
class Milhouse{}
class Bart extends Homer{
	void doh(Milhouse mh) {
		printLn("doh milhouse");
		
	}
}

public class Hide {
	public static void main(String[] args) {
		Bart b=new Bart();
		b.doh('c');
		b.doh(12.0f);
		b.doh(new Milhouse());
	}
}
