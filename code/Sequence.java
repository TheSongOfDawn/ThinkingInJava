//内部类自动拥有对其外部类所有成员的访问权限
import static utils.Print.*;
interface Selector{
	boolean end();
	Object current();
	void next();
}
public class Sequence {
	private Object[] items;
	private int next=0;
	public Sequence(int size) {items=new Object[size];}
	public void add(Object x) {
		if(next<items.length)
			items[next++]=x;
	}
	private class SequenceSelector implements Selector{
		private int i=0;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i==items.length;//直接访问外围对象的所有成员
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i<items.length)
				i++;
		}
		
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence=new Sequence(10);
		for(int i=0;i<10;i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector=sequence.selector();
		while(!selector.end()) {
			printLn(selector.current()+" ");
			selector.next();
		}
	}

}
