//11.9 Set
/*
 * HashSet 出于速度考虑使用了散列
 * TreeSet将元素存储在红-黑树数据结构中
 * 
 * 最常见的操作就是使用contains测试set的归属性
 * 
 * */
package eleven;

import static utils.Print.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1=new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
		set1.add("M");
		printLn("H: "+set1.contains("H"));
		printLn("N: "+set1.contains("N"));
		Set<String> set2=new HashSet<String>();
		Collections.addAll(set2, "H I J K L".split(" "));
		printLn("set2 in set1 :"+set1.containsAll(set2));
		set1.remove("H");
		printLn("Set1:" +set1);
		printLn("Set2 in set1 :"+set1.containsAll(set2));
		set1.removeAll(set2);
		print("set2 removed from set1:"+set1);
		Collections.addAll(set1,"X Y Z".split(" "));
		printLn("X Y Z ADD TO set1:"+set1);	
	}
}
/*
 * output:
H: true
N: false
set2 in set1 :true
Set1:[A, B, C, D, E, F, G, I, J, K, L, M]
Set2 in set1 :false
set2 removed from set1:[A, B, C, D, E, F, G, M]X Y Z ADD TO set1:[A, B, C, D, E, F, G, M, X, Y, Z]

 * */