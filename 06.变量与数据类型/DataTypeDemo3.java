/*
	+��һ������������Ǵ��ὲ�⣩�����ӷ����㡣
	һ����˵�������������ʱ��Ҫ�����������������ͱ���һ�¡�
	ע�⣺
		boolean���Ͳ���ת��Ϊ�������������͡�
	Ĭ��ת������С�����ת����
		A��byte,short,char--int--long-float-double
		B: byte,short,char�໥ֱ�Ӳ�ת�������ǲ�����������ת��Ϊint����
*/
public class DataTypeDemo3{
	public static void main(String[] args){
		//ֱ������ķ�ʽ���ӷ�
		//System.out.println(3 + 4);
		
		//����int�������ӷ�
		int x = 3;
		int y = 4;
		int z = x + y;
		System.out.println(z);
	
		byte a = 3;
		int b = 4;
		System.out.println(a + b);
		
		//������ʧ����
		//byte c = a + b;
		int c = a + b;
		System.out.println(c);
	}
}