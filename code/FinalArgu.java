//final ����
//���Զ�ȡ �������޸�

//final ���� ��ȷ��ֹ���� 
//��������private��������ʽ��ָ��Ϊ��final��

//��ĳ���ඨ��Ϊfinalʱ ����������̳и��� ���Ҳ����������ô�� �Ҹ��������еķ���Ҳ��ʽ��Ϊfinal
/*final class a{}
 * */
class Gizmo {
	public void spin() {
	}
}

public class FinalArgu {
	void with(final Gizmo g) {
		// ! g=new Gizmo();//��Ϊg ��һ��final����
	}

	void withOut(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}

//	void f(final int i) {
//		//i++; i��һ��final���� ���Զ�ȡ���ǲ��ܹ��޸�
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
