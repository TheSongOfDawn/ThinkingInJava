//11.8 Stack
//要防止与默认java.util.Stack 相冲突
//类名之后的T 告诉编译器这将是个参数化类型 
package eleven;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	//接受T类型的对象
	public void push(T v) {
		storage.addFirst(v);
	}
	//peek()提供栈顶元素
	public T peek() {
		return storage.getFirst();
	}
	//移除并返回栈顶元素
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
