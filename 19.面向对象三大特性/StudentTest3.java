/**
	һ����׼������հ�
	
	ѧ���ࣺ
		��Ա������
			name,age
		���췽����
			�޲Σ���������
		��Ա������
			getXxx()/setXxx()
			show();�����������г�Ա����ֵ
	����Ա������ֵ��
		A��setXxx();
		B�����췽��
	�����Ա�����ķ�ʽ��
		A��ͨ��getXxx�ֱ��ȡȻ��ƴ��
		B��ͨ������show()����
		
	ע�⣺
		Ŀǰ�Ĵ�����Ϊ����ϰ��һ�ֱ�׼��ʽ
		����Ա�������������ַ�ʽ������ֻдһ��
		�����������ȡ���ݣ����Բ�дgetXxx()����
*/
class Student{
	//����
	private String name;
	//����
	private int age;
	
	public Student(){}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	//������еĳ�Ա����
	public void show(){
		System.out.println(name+"---"+age);
	}
}

//������
public class StudentTest3{
	public static void main(String[] args){
		//��ʽ1����Ա������ֵ
		Student s1 = new Student();
		s1.setName("������");
		s1.setAge(24);
		//���ֵ
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println();
		
		//��ʽ2����Ա������ֵ
		Student s2 = new Student("������2",18);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
	}
}