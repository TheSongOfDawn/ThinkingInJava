/*
 * 5.4.1 �ڹ������е��ù�����
 * 
 * 
 * 
 * 
 * */
public class Flower {
	private int petalCount=0;
	String s="initial value";
	Flower(int petals){
		petalCount=petals;
		System.out.println("������ w/ int arg only,petalCount="+petalCount);;
		
	}
	Flower(String s){
		this.s=s;
		System.out.println("������ String arg only ,s="+s);
	}
	Flower(String s,int petals){
		this(petals);
		//��������������this ��������һ�������� this (s)
		//���뽫������������������ʼ��
		this.s=s;
		System.out.println("String & int");
	}
	Flower(){
		System.out.println("Ĭ�Ϲ�����");
	}
	void printPetalCount(){
		//û���ڹ�������Ҳ���ܵ��� this(11) ���ֹ�����
		System.out.println("petalCount = "+petalCount+" s = "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f=new Flower();
		f.printPetalCount();
	}
	/*output:
	 * Ĭ�Ϲ�����
	 *petalCount = 0 s = initial value
	 * 
	 * 
	 * 
	 * */

}
