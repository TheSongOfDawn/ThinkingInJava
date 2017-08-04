//11.10 Map
/*
 * 自动包装机制将随机生成的int转换为HashMap可以使用的Integer引用
 * 
 * map与其他collection一样 可以很容易的扩展到多维 
 * 
 * 
 * 
 * */
package eleven;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;



public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand=new Random(47);
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<10000;i++) {
			int r=rand.nextInt(20);
			Integer frep=m.get(r);//如果没有就会直接返回null
			m.put(r, frep==null?1:frep+1);			
		}
		System.out.println(m);
	}

}
