//��������
//��Ȼbart��������һ���µ����ط��� ����bart�����е����ط������ǿ��õ�
//@override ע�� �ڲ�С�����ض����Ǹ�д�˸÷���ʱ �༭���ͻ�����һ��������Ϣ
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
