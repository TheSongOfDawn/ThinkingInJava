//���Դ�������2
public class ms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f());
		
	}
	static boolean f() {
		try {
//			System.out.println("try��....");
//			System.exit(0); ��������ж��ˣ���ֻ��ִ�е����ﲻ�������һ��
			return true;

		} finally {
			System.out.println("finally��....");
			return false;
		}
	}
}
/*output
 * false
 * ��ΪfinallyֻҪ���жϳ����һ����ִ�С�������  
 *ջ���ȷ���true,Ȼ��ջ���ٷ���false,Ȼ��ͷ���ջ�еĵ�һ����  
 * 
 * Return�������ú������Ϸ���
 * ����return���ִ�к�
 * ���ѷ��ؽ�����ý�����ջ�У�
 * ��ʱ�������������Ϸ��أ�
 * ��Ҫִ��finally�����������ʼ���ء�
 * */
