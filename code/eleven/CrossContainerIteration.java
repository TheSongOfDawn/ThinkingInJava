//11.6 ������
//����֪��������ȷ������
//Iterator �ܹ����������������еײ�Ľṹ����

/*����ע��treeset
 * 
 * cannot be cast to java.lang.Comparable����������쳣����
 * ����˵treeMap������treeSet������֪�������put���ͻᱨ����쳣����
 * ��һ��putʱ����ΪΪ�գ����Բ���Ҫ�Ƚϣ������ᱨ�����ǵ��ڶ���putʱ��
 * treeMap������treeSet��Ϊ��ȷ����������ľͱ���Ƚϣ����ʱ����������key�����޷��Ƚϣ����׳����쳣����
 * ��Ϊ��û����дxxd�����ĳЩ���� ����ֻ����ŵĲ���
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
 * ��һ��	listIterator ��һ����ǿ���Iterator�������� ֻ�����ڸ���List��ķ��� 
 * Iteratorֻ����ǰ�ƶ� ����listIterator��˫���ƶ�
 * 
 * it.hasNext() ����ڵ�ǰλ�õ�ǰһ��
 * it.hasPrevious ����ڵ�ǰλ�õĺ�һ��
 * 
 * 
 * */
