/*
	�̳е�ע�����
		A������ֻ�ܼ̳и������з�˽�еĳ�Ա����Ա�����ͳ�Ա������
		B�����಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super�ؼ���ȥ���ʸ��๹�췽��
		C����ҪΪ�˲��ֹ��ܶ�ȥ�̳�
			class A{
				public void show1(){}
				public void show2(){}
			}
			class B{
				public void show2(){}
				public void show3(){}
			}
			//���Ƿ���B���г����˺�A��һ����show2()���������ԣ����Ǿ��ü̳�����
			class B extends A{
				public void show3(){}
			}
			������ʵ���ã���Ϊ�����㲻������show2()����������show1(),�п������show1()����������Ҫ�ġ�
			
		��ô������ʲô�ʺϿ���ʹ�ü̳��أ�
			�̳�����֮�����ֵ��ǣ���is a���Ĺ�ϵ
				Person
					Student
					Teacher
				ˮ��
					ƻ��
					�㽶
					����
			���ü��跨��
				�����������A,B,ֻ�����Ƿ���A��B��һ�֣�����B��A��һ�֣��Ϳ��Կ��Ǽ̳�
*/
class Father{
	private int num = 10;
	public int num2 = 20;
	
	private void method(){
		System.out.println(num);
		System.out.println(num2);
	}
	
	public void show(){
		System.out.println(num);
		System.out.println(num2);
	}
}

class Son extends Father{
	public void function(){
		//System.out.println(num);//num �� Father ���� private ���ʿ���
		System.out.println(num2);
	}
}

public class ExtendsDemo3{
	public static void main(String[] args){
		//��������
		Son s = new Son();
		//s.method();//���಻�ܼ̳и����˽�з���
		s.show();
		//System.out.println(s.num);//num �� Father ���� private ���ʿ���
		s.function();
	}
}