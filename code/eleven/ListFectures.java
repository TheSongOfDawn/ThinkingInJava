package eleven;

/*
 * 基本的ArrayList 长于随机访问元素 但在List中间插入和移除元素时较慢
 * 
 * LinkedList 它通过代价脚底的在List中间进行的插入和删除操作 提供了优化的顺序访问 在随机访问相对比较慢
 * 
 * contains() 确定某个对象是否在列表中
 * 移除一个对象remove() 如果有一个对象的引用 则可以使用indexOf()来发现该对象在List中所处位置的索引编号
 * subList() 方法允许你从一个较大的列表中创建一个片段
 * retainAll() 交集操作
 * 
 * 
 * */
import static utils.Print.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ListFectures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		List<Apple> list=new ArrayList<>();
		
	}

}
