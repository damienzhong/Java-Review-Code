/*
	���⣺
		�Ҳ�����Ҫ����ֲ���Χ��num����Ҫ��������Ա��Χ��num����ô�죿
		�һ���Ҫ��������Ա��Χ��num����ô�죿
			JavaΪ�����ṩ��һ����this���ƵĹؼ��֣�super
			������ֱ�ӷ��ʸ�������ݡ�
			
		this��super������
			�ֱ���ʲô��
				this�������Ӧ������
				super������洢�ռ�ı�ʶ���������Ϊ�������ã����Բ��������Ա��
			��ô���أ�
				A�����ó�Ա����
					this.��Ա���� ���õ��Ǳ����ĳ�Ա����
					super.��Ա���� ���ø���ĳ�Ա����
				B�����ù��췽��	
					this(...)	���ñ���Ĺ��췽��
					super(...)	���ø���Ĺ��췽��
				C�����ó�Ա
					this.��Ա���� 	���õ��Ǳ���ĳ�Ա����
					super.��Ա����	���õ��Ǹ���ĳ�Ա����
				
*/
class Father{
	public int num = 10;	
}

class Son extends Father{
	public int num = 30;
	public void show(){
		int num = 40;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

public class ExtendsDemo5{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
	}
}