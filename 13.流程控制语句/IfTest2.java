/*
	��������DAMIEN������
	��Ŀ��
		����¼���·�ֵ�������Ӧ�ļ���
		
		����3��4��5
		�ģ�6��7��8
		�9��10��11
		����12��1��2
*/
import java.util.Scanner;

public class IfTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���·ݣ�");
		int month = sc.nextInt();
		
		/*if(month<1 || month>12){
			System.out.println("��������·�����");
		}else if(month == 1){
			System.out.println("����");
		}else if(month == 2){
			System.out.println("����");
		}else if(month == 3){
			System.out.println("����");
		}else if(month == 4){
			System.out.println("����");
		}else if(month == 5){
			System.out.println("����");
		}else if(month == 6){
			System.out.println("����");
		}else if(month == 7){
			System.out.println("����");
		}else if(month == 8){
			System.out.println("����");
		}else if(month == 9){
			System.out.println("����");
		}else if(month == 10){
			System.out.println("����");
		}else if(month == 11){
			System.out.println("����");
		}else if(month == 12){
			System.out.println("����");
		}
		*/
		System.out.println("====================================");
		if(month<1 || month>12){
			System.out.println("��������·�����");
		}else if(month>=3 && month<=5){
			System.out.println("����");
		}else if(month>=6 && month<=8){
			System.out.println("����");
		}else if(month>=9 && month<=11){
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	}
}