/*��ĳ������Ҫ�������ˣ���Ӧ�ô���ĳ��״̬��ʹ��ռ�õ��ڴ���Ա���ȫ���ͷš�
 * ֻҪ�����д���û�б��ʵ�����Ĳ��֣�
 * ����ʹ��ں����޵�ȱ�ݣ�
 * finalize()����������
 * �շ����������
 * 
 * 
 * */

public class Book {

	boolean checkedOut=false;
	Book(boolean co){
		checkedOut=co;
	}
	void checkIn(){
		checkedOut=false;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(checkedOut)
			System.out.println("Erro: checkout");
		super.finalize();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book n1=new Book(true);
		n1.checkIn();
		new Book(true);
		//System.gc ����ǿ�ƽ����սᶯ��
		System.gc();
	}
	/*output:
	 * Erro: checkout
	 * ��һ����δ��checkin
	 * 
	 * 
	 * */

}
