/*
	�̳и�����
		�Ѷ��������ͬ�����ݸ���ȡ�������嵽һ�����С�
		
	���ʵ�ּ̳У�
		Java�ṩ�˹ؼ��֣�extends
		
	��ʽ��
		class ������ extends ������{}
		
	�ô���
		A���ṩ�˴���ĸ�����
		B���ṩ�˴����ά����
		C����������֮�������ϵ���Ƕ�̬��ǰ��
		
*/
//�̳�ǰ
/*class Student{
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}
}

class Teacher{
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}
}*/
//ʹ�ü̳к�
class Person{
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}
}

class Student extends Person{}

class Teacher extends Person{}

public class ExtendsDemo{
	public static void main(String[] args){
		Student s = new Student();
		s.eat();
		s.sleep();
		System.out.println("-------------");
		
		Teacher t = new Teacher();
		t.eat();
		t.sleep();
	}
}