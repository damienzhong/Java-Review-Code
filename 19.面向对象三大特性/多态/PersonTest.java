/*
	��ʽ������
		�������ͣ���̫���ˣ�����Ͳ����ˣ�
		�������ͣ�
			�����������������ʱ�������Ѿ������ˣ���Ҫ���Ǹ���Ķ���
			�����ࣺ��Ҫ���Ǹó�������������
			�ӿڣ�
		
*/
abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

//��һ��ѧ����
class Student extends Person{
	public void study(){
		System.out.println("�ú�ѧϰ");
	}
}

public class PersonTest{
	public static void main(String[] args){
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		
	}
}
