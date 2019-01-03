/*
	��̬�ĺô���
		A������˴����ά���ԣ��̳б�֤��
		B������˴������չ��(�ɶ�̬��֤)
		
	è������
*/
class Animal{
	public void eat(){
		System.out.println("eat");
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("������");
	}
	
	public void sleep(){
		System.out.println("��վ��˯��");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
	
	public void sleep(){
		System.out.println("èſ��˯��");
	}
}

class Pig extends Animal{
	public void eat(){
		System.out.println("��Է�");
	}
	
	public void sleep(){
		System.out.println("�����˯��");
	}
}

//��Զ�������Ĺ�����
class AnimalTool{
	private AnimalTool(){}
	/*8public static void useCat(Cat c){
		c.eat();
		c.sleep();
	}
	
	public static void useDog(Dog d){
		d.eat();
		d.sleep();
	}
	
	public static void usePig(Pig p){
		p.eat();
		p.sleep();
	}*/
	public static void useAnimal(Animal a){
		a.eat();
		a.sleep();
	}
}

public class DuoTaiDemo2{
	public static void main(String[] args){
		//��һֻè
		Cat c = new Cat();
		c.eat();
		c.sleep();
		//���ر�ϲ��è��������һֻ
		Cat c2 = new Cat();
		c2.eat();
		c2.sleep();
		//��һֻè
		Cat c3 = new Cat();
		c3.eat();
		c3.sleep();
		System.out.println("-------------------");
		//�������ˣ������˺ܶ�ֻè��ÿ�δ��������ǿ��Խ��ܵģ�
		//�����أ����÷��������˶�������ͬ�⣬�������������ˡ�
		//AnimalTool.useCat(c);
		//AnimalTool.useCat(c2);
		//AnimalTool.useCat(c3);
		//System.out.println("-------------------");
		//�һ�ϲ����������ֻ��
		Dog d = new Dog();
		//����һֻ��
		Dog d2 = new Dog();
		/*AnimalTool.useDog(d);
		AnimalTool.useDog(d2);
		*/
		System.out.println("-------------------");
		//��ϲ��������
		//����һ�����࣬��Ҫ�̳��Զ���ṩ�������������һ����ٹ���������Ӹ��෽������
		Pig p = new Pig();
		Pig p2 = new Pig();
		Pig p3 = new Pig();
		/*AnimalTool.usePig(p);
		AnimalTool.usePig(p2);
		AnimalTool.usePig(p3);*/
		AnimalTool.useAnimal(c);
		AnimalTool.useAnimal(c2);
		AnimalTool.useAnimal(c3);
		AnimalTool.useAnimal(d);
		AnimalTool.useAnimal(d2);
		AnimalTool.useAnimal(p);
		AnimalTool.useAnimal(p2);
		AnimalTool.useAnimal(p3);
	}
	
}