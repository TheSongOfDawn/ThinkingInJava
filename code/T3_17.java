
public class T3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc",b="abc";
		printString(a,b);
		printStringYY(a, b);
		printStringNY(a, b);
		printStringEquals(a, b);
		
		b="def";
		System.out.println("************************************");
		printString(a,b);
		printStringYY(a, b);
		printStringNY(a, b);
		printStringEquals(a, b);
	}
	//==
	public static void printStringYY(String a,String b){
		System.out.println(a+"=="+b+"  "+a==b);
	}
	//!=
	public static void printStringNY(String a,String b){
		System.out.println(a+"!="+b+" "+a!=b);
	}
	//pritnString
	public static void printString(String a,String b){
		System.out.println("第一个字符串为:"+a);
		System.out.println("第二个字符串为:"+b);
		
	}
	//Equals()
	public static void printStringEquals(String a,String b){
		System.out.println("a.equals(b):"+a.equals(b));
	}

}
