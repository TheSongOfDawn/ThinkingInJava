//11.9 Set2

package eleven;

import java.util.Set;
import java.util.TreeSet;

//TextFile ��һ������ ���Դ�һ���ļ� ���������һ��Set��
//������ݸ�TreeSet������ ������list��������ӵ������� ��������treeset ��˽��������� ������ �����ǰ����ֵ����
//����Ҫ������ĸ������ ������TreeSet�Ĺ���������String.CASE_INSENTIVE_ORDER�Ƚ��� 
//��������16����ϸ����
public class UniqueWordsAlphabetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��TreeSet�Ĺ���������String.CASE_INSENTIVE_ORDER�Ƚ���	
		Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("SetOperations.java","\\W+"));
		System.out.println(words);
	}

}
