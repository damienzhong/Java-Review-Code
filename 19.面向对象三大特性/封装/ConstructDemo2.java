/**
	����һֱ��ʹ�ù��췽�������ǣ�����ȴû�ж��幹�췽�����õ������������أ�
	
	���췽����ע�����
		A���������û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽����
		B��������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽����
			ע�⣺������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ������޲ι��췽��
		
	����Ա������ֵ�����ַ�ʽ��
		A��setXxx();
		B�����췽��
*/
class Student{
	
	private String name;
	private int age;
	
	public Studesnt(){
		System.out.println("�����޲ι��췽��");
	}
	
	//���췽��������
	public Student(String name){
		System.out.println("����һ����String���͵Ĺ��췽��");
		this.name = name;
	}
	
	public Student(int age){
		System.out.println("����һ����int���͵Ĺ��췽��");
		this.age = age;
	}
	
	public Student(String name,int age){
		System.out.println("����һ�������������Ĺ��췽��");
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		System.out.println(this.name + "----"+this.age);
	}
	
}

public class ConstructDemo2{
	public static void main(String[] args){
		//��������
		Student s = new Student();
		s.show();
		System.out.println("------------");
		//��������2
		Student s2 = new Student("������");
		s2.show();
		System.out.println("------------");
		//��������3
		Student s3 = new Student(18);
		s3.show();
		System.out.println("------------");
		//��������4
		Student s4 = new Student("������",18);
		s4.show();
		System.out.println("------------");
	}
}