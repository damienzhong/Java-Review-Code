/**
	private�����Ӧ�ã�
		�ѳ�Ա������private����
		�ṩ��Ӧ��getXxx()/setXxx()����
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
	public void setName(String n){
		name = n;
	}
	
	//��ȡ����ֵ
	public int getAge(){
		return age;
	}
	
	//��������ֵ
	public void setAge(int a){
		age = a;
	}
}

public class StudentTest{
	public static void main(String[] args){
		//����ѧ������
		Student s = new Student();
		//ʹ�ó�Ա����
		//���󣺱�˽�����Σ���粻��ֱ�ӷ���
		//System.out.println(s.name + "---"+ s.age);
		System.out.println(s.getName()+"---"+s.getAge());
		
		//����Ա������ֵ
		//s.name = "������";
		//s.age = 28;
		//ͨ��������ֵ
		s.setName("������");
		s.setAge(28);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}