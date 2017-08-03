//11.6 迭代器
//不必知晓容器的确切类型
//Iterator 能够将遍历序列与序列底层的结构分离

/*关于注释treeset
 * 
 * cannot be cast to java.lang.Comparable，遇到这个异常错误，
 * 就是说treeMap（或者treeSet）并不知道该如何put，就会报这个异常错误。
 * 第一次put时，因为为空，所以不需要比较，即不会报错。但是当第二次put时，
 * treeMap（或者treeSet）为了确保他是有序的就必须比较，这个时候发现这两个key根本无法比较，则抛出该异常错误。
 * 因为我没有重写xxd类里的某些方法 这里只做大概的测试
*/




package eleven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import static utils.Print.*;

class xxd {
	private int id = 0;
	private Random rd = new Random();

	public xxd() {
		id = rd.nextInt();
	}

	public int id() {
		return id;
	}

	public static ArrayList<xxd> arraylist(int n) {
		ArrayList<xxd> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++)
			list.add(new xxd());
		return list;
	}
}

public class CrossContainerIteration {

	public static void display(Iterator<xxd> it) {
		while (it.hasNext()) {
			xxd xd = it.next();
			print(xd.id() + " " + xd + " ");
			//printLn();
		}
		printLn();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<xxd> list = xxd.arraylist(8);
		LinkedList<xxd> LL=new LinkedList<xxd>(list);
		HashSet<xxd> hs=new HashSet<xxd>(list);
		//TreeSet<xxd> ms=new TreeSet<xxd>(list);
		
		
		display(list.iterator());
		
		display(LL.iterator());
		display(hs.iterator());
		//display(ms.iterator());
	}
}

/*
 * 提一下	listIterator 是一个更强大的Iterator的子类型 只能用于各种List类的访问 
 * Iterator只能向前移动 但是listIterator能双向移动
 * 
 * it.hasNext() 相对于当前位置的前一个
 * it.hasPrevious 相对于当前位置的后一个
 * 
 * 
 * */
