/*
	java�м̳е��ص㣺
		A��java��ֻ֧�ֵ��̳У���֧�ֶ�̳�
			��Щ������֧�ֶ�̳еģ���ʽ��extends ��1,��2,...
		B��java֧�ֶ��̳У��̳���ϵ��
*/
/*
class Father{}
class Mother{}
class Son extends Father,Mother{}
*/
class GrandFather{
	public void show(){
		System.out.println("������үү");
	}
}
class Father extends GrandFather{
	public void method(){
		System.out.println("������ְ�");
	}
}

class Son extends Father{}

public class ExtendsDemo2{
	public static void main(String[] args){
		Son s = new Son();
		s.method();
		Father f = new Father();
		f.show();
		s.show();
	}
}