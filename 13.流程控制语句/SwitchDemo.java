/*
	�Ա����̣�DM��������
	
	Switchע�����
		1��case����ֻ�����ǳ����������Ǳ��������ң����case�����ֵ���ܳ�����ͬ��
		2��default����ʡ����
			����ʡ�ԡ�һ�㲻���顣�����жϵ�ֵ�ǹ̶��ġ�����ѡ�⣩
		3��break����ʡ����
			����ʡ�ԣ�һ�㲻���顣���������ܲ�������Ҫ�ġ�
		4��default��λ��һ��Ҫ���������
			���ǣ�����������λ�á����ǽ��������
		5��switch���Ľ�������
			a:����break�ͽ���
			b:ִ�е�ĩβ�ͽ�����
*/

import java.util.Scanner;

public class SwitchDemo{
	public static void main(String[] args){
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//���Ƽ���¼�������
		System.out.println("������һ�����ݣ�1-7����");
		int week = sc.nextInt();
		
		//int number = 1;
				
		switch(week) {
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("���������������");
				break;
		}
		
	}
}