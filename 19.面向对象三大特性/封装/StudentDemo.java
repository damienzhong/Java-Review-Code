/**
	static���ص㣺�����������γ�Ա������Ҳ�������γ�Ա������
		A��������ļ��ض�����
			����main����
		B�������ڶ������
		C����������ж�����
			������
				һ�����ѧ��Ӧ�ù���һ���༶��š�
				ʲôʱ����þ�̬��
				���ĳ����Ա�����Ǳ����ж�����ģ���ô����Ӧ�ö���Ϊ��̬�ġ�
		D������ͨ����������		
			��ʵ������Ҳ����ͨ���������
			�Ƽ�ʹ����������
			��̬���ε�����һ�����ǳ���Ϊ��������صģ����Ա��
*/
class Student{
	//�Ǿ�̬����
	int classNum = 1;
	//��̬����
	static int classNum2 = 2;
}

public class StudentDemo{
	public static void main(String[] args){
		Student s = new Student();
		System.out.println(s.classNum);
		
		System.out.println(Student.classNum2);
		System.out.println(s.classNum2);
	}
}