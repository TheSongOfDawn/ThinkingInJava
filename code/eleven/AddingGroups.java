//11.3 添加一组元素
//容器类类库被划分为两个不同的概念
/*collection 一个独立元素的序列 这些元素都服从一条或多条规则
 * 			List必须按照插入的顺序来保存元素 set不能有从父元素 queue按照排队规则 来确定对象产生的顺序
 *map 一组成对的键值对 允许你使用键来查找值
 * */
package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays.asList() 接受一个数组或是用，分割的元素列表 并将其转化成一个list
		//collection.addAll 接受一个Collection对象 以及一个数组或是用,分隔的列表 将元素添加到Collection中
		//addAll 只接受另一个Collection对象作为参数
		//接受一个数组或是一个用都好分割的元素列表 并将其转换为一个list
		//
		Collection<Integer> collection=new 
				ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts= {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection, moreInts);
		List<Integer> list=Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
	}

}
