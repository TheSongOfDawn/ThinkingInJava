//11.3 ���һ��Ԫ��
//��������ⱻ����Ϊ������ͬ�ĸ���
/*collection һ������Ԫ�ص����� ��ЩԪ�ض�����һ�����������
 * 			List���밴�ղ����˳��������Ԫ�� set�����дӸ�Ԫ�� queue�����Ŷӹ��� ��ȷ�����������˳��
 *map һ��ɶԵļ�ֵ�� ������ʹ�ü�������ֵ
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
		//Arrays.asList() ����һ����������ã��ָ��Ԫ���б� ������ת����һ��list
		//collection.addAll ����һ��Collection���� �Լ�һ�����������,�ָ����б� ��Ԫ����ӵ�Collection��
		//addAll ֻ������һ��Collection������Ϊ����
		//����һ���������һ���ö��÷ָ��Ԫ���б� ������ת��Ϊһ��list
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
