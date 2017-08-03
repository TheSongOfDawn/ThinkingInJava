//11.9 Set2

package eleven;

import java.util.Set;
import java.util.TreeSet;

//TextFile 是一个工具 可以打开一个文件 并将其读入一个Set中
//结果传递给TreeSet构造器 它将把list的内容添加到自身中 由于它是treeset 因此结果是排序的 本例中 排序是按照字典需的
//若想要按照字母序排序 可以向TreeSet的构造器传入String.CASE_INSENTIVE_ORDER比较器 
//构造器在16章详细讲解
public class UniqueWordsAlphabetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//向TreeSet的构造器传入String.CASE_INSENTIVE_ORDER比较器	
		Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("SetOperations.java","\\W+"));
		System.out.println(words);
	}

}
