/*
	�ڿ���̨���һ���������е�*ͼ��
		*****
		*****
		*****
		*****
	�ܽ᣺�ڲ�ѭ���������������ѭ����������
*/
import java.util.Scanner;
public class ForForTest{
	public static void main(String[] args){
		//��ɵ��ɵ�İ취��������
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("------------------------");
		//��forѭ����������
		for(int i = 0;i<4;i++){
			System.out.println("*****");
		}
		System.out.println("------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�����������");
		int n = sc.nextInt();
		System.out.println("������Ҫ�����������");
		int m = sc.nextInt();
		//��������
		for(int j = 0;j<m;j++){
			//����ÿ�е�����
			for(int i=0;i<n;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}