/*
	������д�������г����˺͸����з�������һ��һ���ķ�����
	
	�������أ�
		�����г��ֵķ�����һ���������б�ͬ�ķ������뷵��ֵ�޹ء�
		
	���������÷�����ʱ��
		�������౾�����Ҹ��ࡣ
		
	������д��Ӧ�ã�
		��������Ҫ����Ĺ��ܣ������������������Լ���������ʱ��������д�����еķ�����
		����������Ϯ�˸���Ĺ��ܣ��ֶ������������е����ݡ�
		
		
*/
class IPhoneX{
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
}

class IPhoneXMax extends IPhoneX{
	public void call(String name){
		//System.out.println("��"+name+"��绰");
		super.call(name);
		System.out.println("����װ���Ÿ��Ĺ���");
	}
}

public class ExtendsDemo9{
	public static void main(String[] args){
		IPhoneXMax xMax = new IPhoneXMax();
		xMax.call("������");
	}
}