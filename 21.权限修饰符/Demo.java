/*
	���η���
		Ȩ�����η���private,Ĭ�ϵ�,protected,public
		״̬���η���static,final
		�������η���abstract
		
	�ࣺ
		Ȩ�����η���Ĭ�ϵ�,public
		״̬���η���final
		�������η���abstract
		
		�õ�����ľ��ǣ�public 
	��Ա������
		Ȩ�����η���private,Ĭ�ϵ�,protected,public
		״̬���η���static,final
		
		�õ�����ľ��ǣ�private
	���췽����
		Ȩ�����η���private,Ĭ�ϵ�,protected,public
		
		�õ�����ľ��ǣ�public 
	��Ա������
		Ȩ�����η���private,Ĭ�ϵ�,protected,public
		״̬���η���static,final
		�������η���abstract
		
		�õ�����ľ��ǣ�public 
		
	�����������Ϲ���
			��Ա������public static final
			��Ա������public static 
					  public abstract
					  public final
*/
public class Demo{
	//��Ա����
	private int x = 10;
	int y = 20;
	protected int z = 30;
	public int a = 40;
	public final int b = 50;
	public static int c = 60;
	public static final int d = 70;
	//�˴�������ʹ�����η�abstract
	//abstract int e = 80;
	
	//���췽��
	private Demo(){}
	Demo(String name){}
	protected Demo(String name,int age){}
	public Demo(String name,int age,String sex){}
	
	//public static Demo(){}
	//public final Demo(){}
	//public abstract Demo(){}
	
	//��Ա����
	//static void show(){}
	//abstract void show();
	final void show(){}
}