//3.9.1指数计数法
//分别显示用float、和double指数计数法所能表示的最大数和最小数
public class T3_9 {
	public static void main(String[] args) {
		float f1=Float.MAX_VALUE;
		float f2=Float.MIN_VALUE;
		double d1=Double.MAX_VALUE;
		double d2=Double.MIN_VALUE;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		/*Float.MAX_VALUE 3.4028235E38
		 * Float.MIN_VALUE 1.4E-45
		 * Double.MAX_VALUE 1.7976931348623157E308
		 * Double.MIN_VALUE 4.9E-324
		 * */
	}

}
