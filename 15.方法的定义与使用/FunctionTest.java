/*
	����¼���������ݣ������������еĽϴ�ֵ
*/
import java.util.Scanner;

public class FunctionTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.print("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		int result = getMax(a,b);
		System.out.println("���ֵ�ǣ�"+result);
	}
	
	/**
		������ȷ��
			����ֵ���ͣ�int
			�����б�int a,int b
	*/
	public static int getMax(int x,int y){
		//if���
		/*if(x > y){
			//System.out.println(x);
			return x;
		}else{
			//System.out.println(y);
			return y;
		}
		*/
		//����Ԫ������Ľ�
		//int c =((x>y)?x:y);
		//return c;
		return ((x>y)?x:y);
	}
}