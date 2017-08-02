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
		printLn("SimpleName:" + cc.getSimpleName());//��������������������
		printLn("Cannonical name :" + cc.getCanonicalName());//��������������
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
		for(Class face:c.getInterfaces())//��ʾ����������������Ľӿ�
			printInfo(face);
		//�˷������ص�ǰ��������ʾ����ĳ��ࡣ
		Class up=c.getSuperclass();//��ѯ���Ļ���
		Object obj=null;
		try {
			try {
				obj=up.newInstance();//ʵ�� ���⹹���� ��һ��;��
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
Cannonical name :fourteen.Waterproof Ȩ������
Class name:fourteen.Shoots is interface? [true]
SimpleName:Shoots
Cannonical name :fourteen.Shoots
Class name:fourteen.Toy is interface? [false]
SimpleName:Toy
Cannonical name :fourteen.Toy

 * */
