/*
	if else����Ԫ�����������
		��Ԫ���������ʵ�ֵģ�if else������ʵ�֣��������Ͳ���
		ʲôʱ��ifʵ�ֵ���Ԫʵ�ֲ��ˣ�
			��if�����Ƶ���һ���������ʱ��Ͳ��ܡ�
			Ϊʲô�أ�
				��Ϊ��Ԫ�������һ���������������������֮��϶���õ�һ�������������һ�����
*/
public class IfTest4{	
	public static void main(String[] args){
		//��ȡ�������ݵ����ֵ
		int a = 10;
		int b = 20;
		
		//��if���ʵ��
		int max1;
		if(a > b){
			max1 = a;
		}else {
			max1 = b;
		}
		
		System.out.println("max1:"+max1);
		
		//����Ԫ�Ľ�
		int max2 = (a > b)? a:b;
		System.out.println("max2:"+max2);
		
		//�ж�һ����������������ż�������������������ż��
		int x = 100;
		
		if(x%2 == 0){
			System.out.println("x��ż��");
		}else {
			System.out.println("x������");
		}
		
		//x%2 == 0?System.out.println("x��ż��"):System.out.println("x������");
	}
}