/*
 * 5.4.1 在构造器中调用构造器
 * 
 * 
 * 
 * 
 * */
public class Flower {
	private int petalCount=0;
	String s="initial value";
	Flower(int petals){
		petalCount=petals;
		System.out.println("构造器 w/ int arg only,petalCount="+petalCount);;
		
	}
	Flower(String s){
		this.s=s;
		System.out.println("构造器 String arg only ,s="+s);
	}
	Flower(String s,int petals){
		this(petals);
		//不能在这里再用this 调用另外一个构造器 this (s)
		//必须将构造器调用置于最起始处
		this.s=s;
		System.out.println("String & int");
	}
	Flower(){
		System.out.println("默认构造器");
	}
	void printPetalCount(){
		//没有在构造器里也不能调用 this(11) 这种构造器
		System.out.println("petalCount = "+petalCount+" s = "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f=new Flower();
		f.printPetalCount();
	}
	/*output:
	 * 默认构造器
	 *petalCount = 0 s = initial value
	 * 
	 * 
	 * 
	 * */

}
