/*
	�ڲ��ࣺ
		���ඨ������������ڲ��������ͱ���Ϊ�ڲ��ࡣ
		����������A�ж���һ����B����B�����ڲ���
		
	�ڲ���ķ����ص㣺
		A���ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�е�
		B���ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
*/
class Outer{
	private int num = 10;
	
	class Inner{
		public void show(){
			System.out.println(num);
		}
	}
	
	public void method(){
		//�Ҳ�������
		//show();
		
		Inner i = new Inner();
		i.show();
	}
}

public class InnerDemo{
	public static void main(String[] args){
		Outer o = new Outer();
	}
}