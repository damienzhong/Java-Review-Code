/*
	��Ŀ����Ҫ�����ĺ�
	
	�����Ĺ�����ͬ�������б�ͬ�������Ϊ�˼���֪�⣬Java����������һ��������
	��Java�У����������Ϊ����������
	
	�������أ�
		��ͬһ�����У���������ͬ�������б�ͬ���뷵��ֵ�����޹�
		
	�����б�ͬ��
		A������������ͬ
		B���������Ͳ�ͬ
	
*/
public class FunctionDemo4{
	public static void main(String[] args){
		//jvm����ݲ�ͬ�Ĳ���ȥ���ò�ͬ�Ĺ���
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	//���������ĺ�
	public static int sum(int a,int b){
		return a+b;
	}
	
	//���������ĺ�
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
	//���ĸ����ĺ�
	public static int sum(int a,int b,int c,int d){
		return a+b+c+d;
	}
	
	public static float sum(float a,float b){
		return a+b;
	}
	
}