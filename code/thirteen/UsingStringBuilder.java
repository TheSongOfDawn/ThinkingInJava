//13.2 StringBuilder

/*
 * 如果你要在toString方法中使用循环 那么最好自己创建一个StringBuilder 用它来构造最终结果
 * StringBuilder提供了丰富而全面的方法 包括 insert() replace() substring() 甚至reverse()
 * 
 * */

package thirteen;

import java.util.Random;

public class UsingStringBuilder {
	public static Random rand=new Random(47);
	public String toString() {
		StringBuilder result=new StringBuilder("[");
		for(int i=0;i<25;i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length()-2, result.length());
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingStringBuilder usb=new UsingStringBuilder();
		System.out.println(usb);
	}

}
