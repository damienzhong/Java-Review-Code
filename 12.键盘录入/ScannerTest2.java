/*
	����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
*/
import java.util.Scanner;

public class ScannerTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������һ�����ݣ�");
		int x = sc.nextInt();
		
		System.out.print("������ڶ������ݣ�");
		int y = sc.nextInt();
		
		int max = (x > y?x: y);
		System.out.println("max:"+ max);
		
		byte b = (byte)300;
		System.out.println(b);
	}
}
/*
����¼���������ݣ���ȡ�����������е����ֵ
����¼���������ݣ��Ƚ������������Ƿ����
*/