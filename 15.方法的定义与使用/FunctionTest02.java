/** ˢ�������ţ����
	����¼���������ݣ��Ƚ��������Ƿ����
	
	������
		�Ƚ��������Ƿ����==�������һ��boolean����
*/
import java.util.Scanner;

public class FunctionTest02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ�����ݣ�");
		int a = sc.nextInt();
		
		System.out.print("������ڶ������ݣ�");
		int b = sc.nextInt();
		
		boolean flag = compare(a,b);
		System.out.println(flag);
	}
	
	/**
		������ȷ��
			����ֵ���ͣ�boolean
			�����б�int x,int y
	*/
	public static boolean compare(int x,int y){
		//if����ʵ��
		/*if(x == y){
			return true;
		}else{
			return false;
		}*/
		//��Ԫ������Ľ�
		//boolean flag =((x==y)?true:false);
		//return flag;
		//�����Ľ�
		//return ((x==y)?true:false);
		//���հ�
		return x == y;
	}
}