/*
	�ֲ��ڲ��ࣺ
		A:����ֱ�ӷ����ⲿ��ĳ�Ա
		B:�ھֲ�λ�ã����Դ����ڲ������ͨ����������ڲ��෽������ʹ�þֲ��ڲ��๦��
		
	�ֲ��ڲ�����ʾֲ�������ע�����
		A���ֲ��ڲ�����ʾֲ�����������final����
		B��Ϊʲô�أ�
			�ֲ����������ŷ����ĵ��ö����ã����ŵ�����϶���ʧ��
			�����ڴ�����ݲ�����������ʧ�����ԣ����Ǽ�final���Ρ�
			����final���κ���������ͳ��˳�������Ȼ�ǳ���������ʧ�ˣ�
			�����ڴ��д洢��������20�����ԣ��һ�����������ʹ�õġ�
*/
class Outer{
	private int num = 10;
	
	public void method(){
		int num2 = 20;
		class Inner{
			public void show(){
				System.out.println(num);
				System.out.println(num2);
			}
		}
		
		Inner i = new Inner();
		i.show();
	}
}

public class InnerClassDemo4{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}