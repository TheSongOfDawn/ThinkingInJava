/*当某个对象要被清理了，它应该处于某种状态，使他占用的内存可以被安全地释放。
 * 只要对象中存在没有被适当清理的部分，
 * 程序就存在很隐晦的缺陷，
 * finalize()可以用来最
 * 终发现这种情况
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
		//System.gc 用于强制进行终结动作
		System.gc();
	}
	/*output:
	 * Erro: checkout
	 * 有一本书未被checkin
	 * 
	 * 
	 * */

}
