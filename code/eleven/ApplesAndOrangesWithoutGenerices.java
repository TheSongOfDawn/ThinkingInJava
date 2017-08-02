/* 11 持有对象
 * 泛型和类型安全的容器
 * java容器类都可以自动地调整自己的尺寸
 */
package eleven;

import java.util.ArrayList;
import static utils.Print.*;
class Apple{
	private static long counter;
	private final long id=counter++;
	public long id() {
		return id;
	}
}
class Oranger{}
class Gala extends Apple{}
class Fuji extends Apple{}

public class ApplesAndOrangesWithoutGenerices {

	@SuppressWarnings("unchecked")//表示只有有关 不接受检查的异常的 警告信息应该被抑制
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList apples=new ArrayList();
//		for(int i=0;i<3;i++) {
//			apples.add(new Apple());
//		}
//		apples.add(new Oranger());
//		for(int i=0;i<apples.size();i++) {
//			((Apple) apples.get(i)).id();
//		}
		
		
//		ArrayList<Apple> apples=new ArrayList<Apple>();
//		for(int i=0;i<3;i++) {
//			apples.add(new Apple());
//		}
//		//编译时报错
////		apples.add(new Oranger());
//		for(int i=0;i<apples.size();i++) {
//			System.out.println(apples.get(i).id());//类型转换也不是必须的 因为list知道它保存的是什么类型它会在调用get方法的时候自动帮我们转型
//		}
//		for(Apple a:apples) {
//			printLn(a.id());
//		}
		
		//向上转型也可以作用于泛型
		
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new Gala());
		apples.add(new Apple());
		apples.add(new Fuji());
		for(Apple a:apples) {
			printLn(a.id());
		}
		
	}
}
/*因为arraylist类保存的是object这个类 所以不仅可以添加apple 还可以添加oranger类
 * 
 * 使用get方法时 得到的只是object的引用 必须将它转型为Apple 运行时最后一个报错
 * Exception in thread "main" java.lang.ClassCastException: eleven.Oranger cannot be cast to eleven.Apple
	at eleven.ApplesAndOrangesWithoutGenerices.main(ApplesAndOrangesWithoutGenerices.java:29)
 * 
 * */

