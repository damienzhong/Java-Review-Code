/*
	��һ��Java�ļ���д�����ࣺһ�������࣬һ��������
	ע�⣺��Ϊ���Ǳ���Ҫʹ��StudentDemo�������ԣ��������壬��������Ҫ�����ļ������������һ��
	
	���ʹ���أ�
		��������ʹ��
	
	��δ�������
		��ʽ������ ������ = new ����();
		
	���ʹ�ó�Ա������
		����.������
	���ʹ�÷�����
		����.������(...);
*/
class Student{
	//�����Ա����
	//����
	String name;
	//����
	int age;
	//�Ա�
	String sex;
	
	//�����Ա����
	//ѧϰ�ķ���
	public void study(){
		System.out.println("���ڿ������ӵ�Java��Ƶѧϰ��ing...");
	}
	
	//�Է��ķ���
	public void eat(){
		System.out.println("��ڳԷ���ing...");
	}
	
	//˯���ķ���
	public void sleep(){
		System.out.println("��ɫ������Ҫ˯����~");
	}
}

//���ǲ�����
class StudentDemo{
	public static void main(String[] args){
		//���� ������ = new ����();
		Student s = new Student();
		System.out.println(s);
		//�����Ա����
		//System.out.println(s.name);
		//System.out.println(s.age);
		//System.out.println(s.sex);
		System.out.println(s.name+"==="+s.age+"==="+s.sex);
		//����Ա������ֵ
		s.name = "������";
		s.age = 18;
		s.sex = "��";
		System.out.println(s.name+"==="+s.age+"==="+s.sex);
		
		//���÷���
		s.study();
		s.eat();
		s.sleep();
	}
}