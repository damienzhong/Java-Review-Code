/**
*	�������ͣ�Java������ǿ�������ԣ�����ÿһ�����ݶ���������ȷ�ľ����������ͣ����ڴ��ܷ����˲�ͬ��С���ڴ�ռ�
*
*	�������ͷ��ࣺ
*		A��������������
*		B�������������ͣ��ࡢ�ӿڡ����飩
*	
*	�����������ͣ�4��8��		
*	A:����					ռ���ֽ���
*		byte					1
*		short					2
*		int						4
*		long					8
*	
*	B��������
*		float					4
*		double					8
*
*	C:�ַ�
*		char					2
*	
*	D:����
*		boolean					1
*
*	Ĭ�ϣ�
*		����Ĭ����int����
*		������Ĭ����double����
*		
*		�����ͺ�׺��L����l��ǡ�������L��
*		�����ȸ�������F����f��ǡ�����ʹ��F
*		
*/
public class DataTypeDemo{
	public static void main(String[] args){
		//��������ĸ�ʽ
		//�������� ������ = ��ʼ��ֵ;
		
		//����һ���ֽڱ���
		byte b = 11;
		System.out.println(10);
		System.out.println(b);
		
		//��һ�������ͱ���
		short s = 100;
		System.out.println(s);
		
		//����һ�����ͱ���
		int i = 1000;
		System.out.println(i);
		
		//������int�ķ�Χ
		//int j = 100000000000;
		long j = 100000000000L;
		System.out.println(j);
		//���帡�����ݱ���
		float f = 12.345F;
		System.out.println(f);
		
		double d = 12.345;
		System.out.println(d);
		
		//�����ַ�����
		char ch = 'a';
		System.out.println(ch);
		
		//���岼������
		boolean flag = true;
		System.out.println(flag);
	}
}