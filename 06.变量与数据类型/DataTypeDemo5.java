/*
	˼����1���������������û������
		double d = 12.345;
		float f = d;
		
	˼����2��������������������û�������أ�
		float f1 = (float)12.345;
		float f2 = 12.345F;
*/
public class DataTypeDemo5{
	
	public static void main(String[] args){
		//��double��ֵ��float������ǿ������ת��
		double d = 12.345;
		float f = (float)d;
		//������������������û�������أ�
		float f1 = (float)12.345;
		float f2 = 12.345F;
		System.out.println(f1);
		System.out.println(f2);
	}
}