/*
	����¼����ϰ��
		����¼���������ݣ�����������������ͣ��������
*/
import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������һ�����ݣ�");
		int x = sc.nextInt();
		
		System.out.print("������ڶ������ݣ�");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println("sum:"+sum);
	}
}