/*
 * Java�ڽ���һ��������ת��ΪInt��ʱ�����ǶԸ�����ִ�н�β������
 * �����Ҫ�����ֽ��������������������Ҫʹ��java.Math.round����()
 * ͨ�� ���ʽ�г��ֵ������������;����˱��ʽ���ս������������
 * 
 * 3-16 �����������������л����еĴ�С������ͬ�� ���ؿ���һֱ���⡣
 * */
public class T3_15 {
	public static void main(String[] args) {
		double dabove=0.7,dbelow=0.4;
		float fabove=0.7f,fbelow=0.4f;
		
		System.out.println("double1 ��β:"+(int)dabove);
		System.out.println("double2 ��β:"+(int)dbelow);
		
		System.out.println("float1 ��β:"+(int)fabove);
		System.out.println("float2 ��β:"+(int)fbelow);
		
		System.out.println("double rounde():"+Math.round(dabove));
		System.out.println("double2 rounde():"+Math.round(dbelow));
		
		System.out.println("float1 round:"+Math.round(fabove));
		System.out.println("float2 round:"+Math.round(fbelow));
		
	}
}
