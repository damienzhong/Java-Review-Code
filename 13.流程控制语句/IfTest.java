/*
	if����ʽ2����ϰ��
		A:��ȡ���������нϴ��ֵ
		B:�ж�һ����������������ż��,���������������ż��
*/

import java.util.Scanner;

public class IfTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		int max;
		
		if(a > b){
			max = a;
		}else {
			max = b;
		}
		
		System.out.println("max:" + max);
		System.out.println("==========================");
		
		System.out.println("��������Ҫ�жϵ����ݣ�");
		int c = sc.nextInt();
		
		if(c%2 == 0){
			System.out.println(c + "���������ż��");
		}else {
			System.out.println(c + "�������������");
		}
	}
}