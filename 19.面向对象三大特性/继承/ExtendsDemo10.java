/*
	������д��ע�����
		A��������˽�з������ܱ���д
			��Ϊ����˽�з�������������޷��̳�
		B��������д���෽��ʱ������Ȩ�޲��ܸ���
			��þ�һ��
		C�����ྲ̬����������Ҳ����ͨ����̬����������д
			��ʵ����㲻�㷽����д����������ȷʵ��ˡ�
			
		������д���෽����ʱ���������һģһ����
*/
class Father{
	public static void show(){
		System.out.println("show Father");
	}
}

class Son extends Father{
	public static void show(){
		System.out.println("show Son");
	}
}

public class ExtendsDemo10{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
	}
}