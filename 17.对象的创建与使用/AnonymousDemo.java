/**
	ע�⣺һ�����ļ��п���д����࣬����ֻ��һ�����ܴ�public�����Ҹ������������ļ�����ͬ
	
	�������󣺾���û�����ֵĶ���
	
	���������Ӧ�ó�����
		A�����÷���������ֻ����һ�ε�ʱ��
			ע�⣺���ö�ε�ʱ�򣬲��ʺ�
				��ô����������������ʲô�ô��أ�
				�У��������������Ͼ������������Ա���������������
		B���������������Ϊʵ�ʲ������д���
*/
class Student{
	public void study(){
		System.out.println("����������ӵ���Ƶѧϰ�����~");
	}
}

class StudentDemo{
	public void method(Student s){
		s.study();
	}
}

public class AnonymousDemo{
	public static void main(String[] args){
		//�����ֵĵ���
		Student s = new Student();
		System.out.println(s);
		System.out.println(s);
		s.study();
		s.study();
		System.out.println("----------------------------");
		
		//��������
		//new Student();
		System.out.println(new Student());
		System.out.println(new Student());//������ʵ�����´�����һ������
		//����������÷���
		new Student().study();
		new Student().study();
		System.out.println("----------------------------");
		
		//����������Ϊʵ�ʲ�������
		StudentDemo sd = new StudentDemo();
		//Student ss = new Student();
		//sd.method(ss);
		//��������
		sd.method(new Student());
		
		//ȫ����������
		new StudentDemo().method(new Student());
	}
}