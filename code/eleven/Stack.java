//11.8 Stack
//Ҫ��ֹ��Ĭ��java.util.Stack ���ͻ
//����֮���T ���߱������⽫�Ǹ����������� 
package eleven;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	//����T���͵Ķ���
	public void push(T v) {
		storage.addFirst(v);
	}
	//peek()�ṩջ��Ԫ��
	public T peek() {
		return storage.getFirst();
	}
	//�Ƴ�������ջ��Ԫ��
	public T pop() {
		return storage.removeFirst();
	}

	public boolean empty() {
		return storage.isEmpty();
	}

	public String toString() {
		return storage.toString();
	}
}
