/*
	������ĳ�Ա�ص㣺
		��Ա�������ȿ����Ǳ�����Ҳ�����ǳ���
		���췽�����С�
					����������ʸ������ݵĳ�ʼ��
		��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ����
		
	������ĳ�Ա�������ԣ�
		A�����󷽷�	ǿ��Ҫ�������������顣
		B���ǳ��󷽷�	����̳е����飬��ߴ��븴����
*/
abstract class Animal{
	public int num = 100;
	public final int num2 = 20;
	
	public Animal(){}
	
	public Animal(String name){}
	
	public abstract void show();
	
	public void method(){
		System.out.println("show Animal method");
	}
}

class Dog extends Animal{
	public void show(){
		System.out.println("show Dog");
	}
}

public class AbstractDemo2{
	public static void main(String[] args){
		//��������
		Animal a = new Dog();
		a.num = 200;
		System.out.println(a.num);
		//a.num2 = 30;
		System.out.println(a.num2);
		System.out.println("------------------------");
		a.show();
		a.method();
	}
}