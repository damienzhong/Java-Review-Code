/*
	��Ա�ڲ���
		���ֱ�ӷ����ڲ���ĳ�Ա��
		�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
*/
class Outer{
	private int num = 10;
	
	class Inner{
		public void show(){
			System.out.println(num);
		}
	}
}

public class InnerClassDemo2{
	public static void main(String[] args){
		//Inner i = new Inner();
		//i.show();
		//Outer o = new Outer();
		//o.new Inner().show();
		//�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
		Outer.Inner i = new Outer().new Inner();
		i.show();
	}
}