/*
	�������û���޲ι��췽������ô����Ĺ��췽���ᱨ��
	��ν����
		A:�ڸ��������һ���޲ι��췽��
		B:ͨ��ʹ��super�ؼ���ȥ��ʾ�ĵ��ø���Ĵ��ι��췽��
		C:����ͨ��thisȥ���ñ�����������췽��
			������һ��Ҫ��һ��ȥ�����˸���Ĺ��췽�������������ݾ�û�г�ʼ����
			
		ע�����
			this(...)����super(...)��������ڵ�һ������ϡ�
			�����˵���ڵ�һ������ϣ��Ϳ��ܶԸ������ݽ����˶�γ�ʼ�������Ա�����ڵ�һ����䡣
		
*/
class Father{
	
	/*public Father(){
		System.out.println("Father���޲ι��췽��");
	}*/
	
	public Father(String name){
		System.out.println("Father�Ĵ��ι��췽��");
	}
}

class Son extends Father{
	public Son(){
		super("������");
		System.out.println("Son���޲ι��췽��");
	}
	
	public Son(String name){
		this();
		System.out.println("Son���޲ι��췽��");
	}
}

public class ExtendsDemo7{
	public static void main(String[] args){
		Son s = new Son();
		Son s1 = new Son("������");
	}
}