/*
	whileѭ������ʽ:
		������ʽ
		   while(�ж��������) {
				 ѭ�������;
		   }
		��չ��ʽ
		   ��ʼ�����;
		   while(�ж��������) {
				 ѭ�������;
				 �����������;
			}
		ͨ�������ʽ�����ǾͿ��Կ�����ʵ��forѭ���ǲ���
		for(��ʼ�����;�ж��������;�����������){
			ѭ�������;
		}
*/
public class WhileDemo{
	public static void main(String[] args){
		//���10���ҵ��Ա���������DM��������
		for(int x=0;x<10;x++){
			System.out.println("�ҵ��Ա���������DM��������");
		}
		System.out.println("===========================");
		int x=0;
		while(x<10){
			System.out.println("�ҵ��Ա���������DM��������");
			x++;
		}
	}
}