/*15.2
 * 
 * */

package fifteen;

class AutoMobile {
}

public class Holder3<T> {

	// 类型参数 放在类名后面
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
		
		//只能在其中存入T类对象或者其子类
		AutoMobile a=h3.get();
		
	}

}
