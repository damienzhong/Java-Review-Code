/*
	��Ա�ڲ�������η���
		private:Ϊ�˱�֤���ݵİ�ȫ��
		static:Ϊ�˷����������
			ע�⣺��̬�ڲ�����ʵ��ⲿ�����ݱ����þ�̬���Ρ�
	
	����������һ���ˣ��������壬�����������ࣩ
	
		class Body{
			
			private class Heart{
				public void operator(){
					System.out.println("����֧������");
				}
			}
			
			public void method(){
				if(����������ҽ��){
					Heart h = new Heart();
					h.operator();
				}
			}
		}
		
		�������ǸղŵĽ��⣬��ʹ��һ�¡�
		Body.Heart bh = new Body().new Heart();
		bh.operator();
		//����private֮�󣬾Ͳ��ܱ������ˣ���ô����ô���أ�
		Body b = new Body();
		b.method();
*/
class Outer{
	private int num = 10;
	private static int num2 = 100;
	
	public static class Inner{
		public void show(){
			//System.out.println(num);
			System.out.println(num2);
		}
		
		public static void show2(){
			//System.out.println(num);
			System.out.println(num2);
		}
	}
}

public class InnerClassDemo3{
	public static void main(String[] args){
		//Outer.Inner oi = new Outer().new Inner();
		//oi.show();
		//oi.show2();
		//��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ��
		//��ʽ���ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		Outer.Inner.show2();
	}
}