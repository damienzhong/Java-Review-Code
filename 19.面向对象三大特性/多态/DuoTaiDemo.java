/*
	��̬��ͬһ������������ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬��
	������
		è��è��è�Ƕ���
		ˮ��Һ�塢���塢���壩
		
		è m = new è();
		���� d = new è();
		
	��̬��ǰ�᣺
		A��Ҫ�м̳й�ϵ
		B��Ҫ�з�����д
			��ʵû�з�����дҲ�ǿ��Եģ��������û�������û������
		C��Ҫ�и�������ָ���������
			�� f = new ��();
			
		�ô�������һ�¶�̬
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
	public static void main(){
		//Ҫ�и�������ָ���������
		//�� f = new ��();
		Fu f = new Zi();
	}
}