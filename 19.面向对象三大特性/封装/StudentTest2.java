/**
	java��Լ��:������Ҫ��������֪��
	
	this���ǵ�ǰ��Ķ������á�����˵�����ʹ���ǰ���һ������
		ע�⣺˭��������������ڸ÷����ڲ���this�ʹ���˭
		
	this�ĳ�����
		����ֲ��������س�Ա����
*/
//��һ��ѧ����
class Student{
	//����
	private String name;
	//����
	private int age;
	
	//��ȡ����ֵ
	public String getName(){
		return name;
	}
	
	//��������ֵ
	public void setName(String name){//name="������";
		//name = name;//������ʹ�ù��򣺾ͽ�ԭ��
		//������������Ŀǰ��û��˵�����Ƶ��÷�������������������
		//����ĵ��ø�ֻ��ͨ��������
		//�������������ڣ���Ӧ�ô������Studentһ������
		//��ô��˭�ܹ�����ǰ��Ķ����أ�java���ṩ��һ���ؼ��� this
		//Student.name = name;
		this.name = name;
	}
	
	//��ȡ����ֵ
	public int getAge(){
		return age;
	}
	
	//��������ֵ
	public void setAge(int age){
		this.age = age;
	}
}

public class StudentTest2{
	public static void main(String[] args){
		//����ѧ������
		Student s = new Student();
		//����Ա������ֵ
		s.setName("������");
		s.setAge(28);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}