/*
	fianl���������ࡢ����������
	
	�ص㣺
		final���������࣬���಻�ܱ��̳С�
		final�������η��������಻�ܱ���д�����ǣ�
		final�������α������ñ������ܱ����¸�ֵ����Ϊ���������ʵ�ǳ�����
		
	������
		A������ֵ����
			"hello",10,true
		B���Զ��峣��
			final int x = 10;
*/
//final class Fu	//�޷�������Fu���м̳�
class Fu{
	public int num = 10;
	public final int num2 = 20;
	/*public final void show(){
		
	}*/
}

class Zi extends Fu{
	public void show(){
		num = 100;
		System.out.println(num);
		
		num2 = 200;//�޷�Ϊ���ձ���num2����ֵ
		System.out.println(num2);
	}
}

public class FinalDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}