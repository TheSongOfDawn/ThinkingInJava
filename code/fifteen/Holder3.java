/*15.2
 * 
 * */

package fifteen;

class AutoMobile {
}

public class Holder3<T> {

	// ���Ͳ��� ������������
	private T a;

	public Holder3(T a) {
		this.a = a;
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder3<AutoMobile> h3 = new Holder3<AutoMobile>(new AutoMobile());
		
		//ֻ�������д���T��������������
		AutoMobile a=h3.get();
		
	}

}
