/*
	��ʽ������
		�������ͣ���̫���ˣ�����Ͳ����ˣ�
		�������ͣ�
			�����������������ʱ�������Ѿ������ˣ���Ҫ���Ǹ���Ķ���
			�����ࣺ��Ҫ���Ǹó�������������
			�ӿڣ���Ҫ���Ǹýӿڵ�ʵ�������
*/
interface Smoking{
	public abstract void smok();
}

class SmokDemo{
	public void method(Smoking s){
		s.smok();
	}
}

class Person implements Smoking{
	public void smok(){
		System.out.println("С���ӱ���̣�");
	}
}

public class PersonTest2{
	public static void main(String[] args){
		SmokDemo sd = new SmokDemo();
		Smoking s = new Person();
		sd.method(s);
	}
}