//final 参数
//可以读取 但不能修改

//final 方法 明确禁止覆盖 
//类中所有private方法都隐式地指定为是final的
class Gizmo {
	public void spin() {
	}
}

public class FinalArgu {
	void with(final Gizmo g) {
		// ! g=new Gizmo();//因为g 是一个final参数
	}

	void withOut(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}

//	void f(final int i) {
//		//i++; i是一个final参数 可以读取但是不能够修改
//	}
	int f(final int i) {
		return i+1;
	}
	public static void main(String [] args) {
		FinalArgu fa=new FinalArgu();
		fa.with(null);
		fa.withOut(null);
	}
	
}
