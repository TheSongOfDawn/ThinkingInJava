/*
 * */

package fourteen;

import static utils.Print.*;

interface HasBatteries {

}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	//Toy() {}

	Toy(int i) {
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {
		super(1);
	}

}

public class ToyTest {

	static void printInfo(Class cc) {
		printLn("Class name:" + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		printLn("SimpleName:" + cc.getSimpleName());//产生不包含包名的类名
		printLn("Cannonical name :" + cc.getCanonicalName());//包含包名的类名
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=null;
		try {
			c=Class.forName("fourteen.FancyToy");
		}catch(ClassNotFoundException e){
			printLn("Cant find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face:c.getInterfaces())//表示该类对象中所包含的接口
			printInfo(face);
		//此方法返回当前对象所表示的类的超类。
		Class up=c.getSuperclass();//查询它的基类
		Object obj=null;
		try {
			try {
				obj=up.newInstance();//实现 虚拟构造器 的一种途径
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				printLn("Cannt instantiate!");
				System.exit(1);
			}
			
		}catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			printLn("Cannt access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
/*output:
Class name:fourteen.FancyToy is interface? [false]
SimpleName:FancyToy
Cannonical name :fourteen.FancyToy
Class name:fourteen.HasBatteries is interface? [true]
SimpleName:HasBatteries
Cannonical name :fourteen.HasBatteries
Class name:fourteen.Waterproof is interface? [true]
SimpleName:Waterproof
Cannonical name :fourteen.Waterproof 权威名称
Class name:fourteen.Shoots is interface? [true]
SimpleName:Shoots
Cannonical name :fourteen.Shoots
Class name:fourteen.Toy is interface? [false]
SimpleName:Toy
Cannonical name :fourteen.Toy

 * */
