/**
	���췽����
		����������ݽ��г�ʼ��
	��ʽ��
		A:��������������ͬ
		B:û�÷���ֵ���ͣ���void��û��
		C:û�о��巵��ֵ
	
	
*/
class Student{
	
	private String name;//null
	private int age;//0
	
	public Student(){
		System.out.println("����һ�����췽��������");
	}
}

public class ConstructDemo{
	public static void main(String[] args){
		//��������
		Student s = new Student();
		System.out.println(s);
	}
}