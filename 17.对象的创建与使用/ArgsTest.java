/*
	��ʽ���������⣺
		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
*/
//��ʽ�����ǻ�������
class Demo{
	public int sum(int a,int b){
		return a + b;
	}
}

//��ʽ��������������
class Student{
	public void study(){
		System.out.println("�������ӵ���Ƶ�������ҵ�Javaѧϰ");
	}
}

class StudentDemo{
	public void method(Student s){
		s.study();
	}
}

public class ArgsTest{
	public static void main(String[] args){
		//��ʽ�����ǻ������͵ĵ���
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println(result);
		System.out.println("---------------");
		
		//��ʽ�������������͵ĵ���
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}