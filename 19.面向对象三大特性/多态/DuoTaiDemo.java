/*
	��̬��ͬһ������������ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬��
	������
		è��è��è�Ƕ��
		ˮ��Һ�塢���塢���壩��
		è m = new è();
		���� d = new è();
	��̬��ǰ�᣺
		A��Ҫ�м̳й�ϵ
		B��Ҫ�з�����д
			��ʵû��Ҳ�ǿ��Եģ��������û�������û�����塣
		C��Ҫ�и�������ָ���������
			�� f = new Zi();
			
	��̬�еĳ�Ա�����ص㣺
		A����Ա����
			���뿴��ߣ����п����
		B�����췽��
			������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ����
		C����Ա����
			���뿴��ߣ����п��ұ�
		D����̬����
			���뿴��ߣ����п����
			(��̬������أ��㲻����д�����Է��ʻ�����ߵ�)
			
		���ڳ�Ա�������ڷ�����д�����������п��ұߡ�
*/
class Fu{
	public int num = 100;
	public void show(){
		System.out.println("show Fu");
	}
	
	public static void function(){
		System.out.println("function Fu");
	}
}

class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	public void show(){
		System.out.println("show Zi");
	}
	
	public void method(){
		System.out.println("method Zi");
	}
	
	public static void function(){
		System.out.println("function Zi");
	}
}

public class DuoTaiDemo{
	public static void main(String[] args){
		//Ҫ�и�������ָ���������
		//�� f = new Zi();
		Fu f = new Zi();
		System.out.println(f.num);
		//�Ҳ�������
		//System.out.println(f.num2);
		f.show();
		//�Ҳ�������
		//f.method();
		f.function();
	}
}