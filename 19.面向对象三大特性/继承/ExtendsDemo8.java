/*
	�̳��еĳ�Ա�����Ĺ�ϵ��
		A:�����еķ����͸����еķ���������һ��������ֱ�ӵ��ø÷������ķ���
		B:�����еķ����͸����еķ�������һ��������ô�棿
			ͨ��������÷�����
				a:���������У���û������������о�ʹ��
				b:�ٿ������У���û������������о�ʹ��
				c:�����û�У��ͱ���
*/
class Father{
	public void show(){
		System.out.println("show Father");
	}
}

class Son extends Father{
	public void method(){
		System.out.println("method Son");
	}
	
	public void show(){
		System.out.println("show Son");
	}
}

public class ExtendsDemo8{
	public static void main(String[] args){
		//��������
		Son s = new Son();
		s.show();
		s.method();
		s.function();
	}
}