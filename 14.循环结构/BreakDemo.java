/*
	��ת������䣺
		1��break �ж�
		2��continue  ����
		3��return	����
		
	break���ж�
	ʹ�ó�����
		A��switch�����
		B��ѭ�������
			��ѭ������м���if�жϵ������
		ע�⣺�뿪�������ֳ�����������
	
	���ʹ�ã�
		A����������ѭ��
		B���������ѭ��
			Ҫ��ʵ�ֶ��ѭ�����ͱ���֪��һ��������
			����ǩ����䣺
				��ʽ��
					��ǩ��:���
*/
public class BreakDemo{
	public static void main(String[] args){
		//�� switch �� loop �ⲿ�ж�
		//break;
		
		//��������ѭ
		for(int i = 0;i<10;i++){
			if(i==2){
				break;
			}
			System.out.println("�ҵ��Ա���װ��������DM��������");
		}
		System.out.println("���ʱ�����");
		System.out.println("============================");
		
		wc:for(int i = 0;i<5;i++){
			nc:for(int j=0;j<4;j++){
				if(j==2){
					break nc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}