/*
	Math������ִ�л�������������
	
	����Math����java.lang���£����Բ���Ҫ����
	
	�ص㣺
		û�й��췽������Ϊ���ĳ�Աȫ���Ǿ�̬��
		
	����һ��������
		��ȡ�����
		public static double random();���ش����ŵ�doubleֵ����ֵ���ڵ���0.0��С��1.0
*/
public class MathDemo{
	public static void main(String[] args){
		//��ȡһ�������
		//double d = Math.random();
		//System.out.println(d);
		
		//��Ҫ��ȡһ��1-100֮��������
		for(int i=0;i<100;i++){
			int num = (int)(Math.random()*100)+1;
			System.out.println(num);
		}	
	}
}