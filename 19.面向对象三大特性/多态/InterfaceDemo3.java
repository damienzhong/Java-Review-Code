/*
	�����ࣺ
		�̳й�ϵ��ֻ�ܵ��̳У����Զ��̳�
	����ӿڣ�
		ʵ�ֹ�ϵ,���Ե�ʵ�֣�Ҳ���Զ�ʵ��
	�ӿ���ӿڣ�
		�̳й�ϵ�����Ե��̳У�Ҳ����ʵ�ֶ�̳�,���Զ��̳�
*/
interface Father{
	public abstract void show();
}

interface Mother extends NaiNai{
	public abstract void show2();
}

interface NaiNai{
	public abstract void show3();
}

interface Sister extends Father,Mother{
	
}

class Son implements Father,Mother{
	public void show(){
		System.out.println("show Son");
	}
	public void show2(){
		System.out.println("show2 Son");
	}
	public void show3(){
		System.out.println("show3 Son");
	}
}

public class InterfaceDemo3{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		s.show2();
		s.show3();
	}
}