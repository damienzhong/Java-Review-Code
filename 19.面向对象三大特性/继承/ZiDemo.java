/*
	�̳еĴ������֣�
		���ڼ̳��з�����һ�����󣺷�����д��
		���ԣ�����Ĺ��ܣ��ͻᱻ��������ǡ�
		��Щʱ�����ǲ���������ȥ���ǵ�����Ĺ��ܣ�ֻ������ʹ�á�
		���ʱ��Java��Ϊ�����ṩ��һ���ؼ��֣�final
		
		final:���յ���˼�������������������ࡢ������������
*/
class Fu{
	public final void show(){
		System.out.println("�����ļ����κ��˲����޸�");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("����ʲô����������˺����");
	}
}

public class ZiDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}