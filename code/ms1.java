//������������һ��������
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
	 * 1.==�ڱȽ϶������͵�ʱ���ǱȽϵ�ֵַ��
	 * 2.Integer��һ����������-128~127��ʱ��
	 * ���ɵ�Integer������ͬһ����ֵַ������Ϊtrue
	 * �����������Χ�����ľ��ǲ�ͬ�Ķ���������==�Ƚ�Ϊfalse
	 * */
}
