//11.10 Map
/*
 * �Զ���װ���ƽ�������ɵ�intת��ΪHashMap����ʹ�õ�Integer����
 * 
 * map������collectionһ�� ���Ժ����׵���չ����ά 
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
			Integer frep=m.get(r);//���û�оͻ�ֱ�ӷ���null
			m.put(r, frep==null?1:frep+1);			
		}
		System.out.println(m);
	}

}
