
//使用引用计数器来跟踪仍旧访问着共享对象的数量
/*
 * Creating shared0
Creating Composing0
Creating Composing1
Creating Composing2
Creating Composing3
disposing Composing0
disposing Composing1
disposing Composing2
disposing Composing3
Disposing shared0
*/
import static utils.Print.*;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private static long id = counter++;

	public Shared() {
		printLn("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0) {
			printLn("Disposing "+this);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "shared"+id;
	}
}

class Composing{
	private Shared shared;
	private static long counter =0;
	private final long id =counter++;
	public Composing(Shared shared) {
		printLn("Creating "+this);
		this.shared=shared;
		this.shared.addRef();
	}
	protected void dispose() {
		printLn("disposing "+this);
		shared.dispose();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Composing"+id;
	}
}
public class ReferenceCounting {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared=new Shared();
		Composing[] composing= {new Composing(shared),
				new Composing(shared),new Composing(shared),new Composing(shared),
		};
		for(Composing c:composing) {
			c.dispose();
		}
	}

}
