/*
	��̬�ı׶ˣ�
		����ʹ���������й��ܡ�
		
	�Ҿ���ʹ����������й��ܣ��в��У�
		��
	��ô���أ�
		A���������������÷����������ԣ����Ǻܶ�ʱ�򲻺������ң�̫ռ���ڴ棩
		B���Ѹ��������ǿ��ת��Ϊ��������á�������ת�ͣ�
		
	������ת�����⣺
		����ת�ͣ�
			Fu f = new Zi();
		����ת�ͣ�
			Zi z = (Zi)f;//Ҫ���f�������ܹ�ת��ΪZi
*/
class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("show Zi");
	}
	
	public void method(){
		System.out.println("method Zi");
	}
}

public class DuoTaiDemo3{
	public static void main(String[] args){
		Fu f = new Zi();
		//f.show();
		//f.method();
		//�����������
		//Zi zi = new Zi();
		//zi.show();
		//zi.method();
		//���ӵĶ���ֵ�����ף�������Ϊ���������������ӵĲ�һ�£�����������Ҫ����ǿ������ת��
		Zi z = (Zi)f;
		z.show();
		z.method();
	}
}