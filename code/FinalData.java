//final�ؼ���-��final ����
import static utils.Print.*;

/*final ���� һ�������ı�ı���ʱ����
 * 		һ��������ʱ����ʼ����ֵ�����㲻ϣ�������ı�
 * 		���ڻ������� finalʹ��ֵ�㶨���� �����ڶ������� finalʹ���ú㶨����
 * 
 * �հ� final ������
 * calss blank{
 * 	private final int j;//blank final
 * public blank(){
 * 		j=1;
 * }
 * 
 * }//��������Ķ��崦����ÿ�����������ñ��ʽ��final���и�ֵ
 * */
import java.util.Random;
//Value ��Ĭ�ϰ����Ѿ������Value���� �ǰ�����Ȩ�� 
class Value1{
	int i;//������Ȩ��
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
	//����Ϊpublic ����Ա����ڰ�֮�⣬����Ϊstatic ��ǿ��ֻ��һ�ݣ�����Ϊfinal һ������
	public static final int VALUE_THREE=39;
	//�����ڱ���ʱ�Ϳ���֪������ֵ
	private final int i4=rand.nextInt(20);
	static final int INT_5=rand.nextInt(20);
	private Value1 v1=new Value1(11);
	//������Ϊv2��final�� ����Ϊ�޷��ı�����ֵ
	private final Value1 v2=new Value1(22);
	private static final Value1 VAL_3=new Value1(33);
	
	//����
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
