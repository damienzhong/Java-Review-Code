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
}

public class DuoTaiDemo{
	public static void main(String[] args){
		//Ҫ�и�������ָ���������
		//�� f = new Zi();
		Fu f = new Zi();
	}
}