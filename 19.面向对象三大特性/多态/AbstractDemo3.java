/*
	һ�������û�г��󷽷����ɲ����Զ���Ϊ�����ࣿ������ԣ���ʲô���壿
		A:����
		B:���ô�������
	
	
	�����಻�ܺ���Щ�ؼ��ֹ���
		private ��ͻ
		final ��ͻ
		static ������
*/
abstract class Fu{
	//�Ƿ������η����: abstract��private
	//private abstract void show();
	// �Ƿ������η����: abstract��final
	//final abstract void show();
	//�Ƿ������η����: abstract��static/
	//static abstract void show();
	
	public static void method(){
		System.out.println("method");
	}
}
class Zi extends Fu{
	public void show(){}
}
public class AbstractDemo3{
	public static void main(String[] args){
		Fu.method();
	}
}