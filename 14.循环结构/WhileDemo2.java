/*
	whileѭ����forѭ��������
		ʹ�������������ѭ�������󣬼���ʹ�ÿ����������Ǹ���������ʹ��whileѭ��������ʹ��forѭ������֪����fprѭ����
		��Ϊ��������Ĵ��ڴ�����ʧ����������ڴ��ʹ��Ч�ʡ�
	����һ�ֳ�����
		�����һ����Χ�ģ���forѭ���ǳ���ȷ��
		����ǲ���ȷҪ�����ٴΣ���whileѭ����Ϊ���ʡ�
*/
import java.util.*;
public class WhileDemo2{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println("ף��Ҷ���ڿ��֣�����Խ��Խ�");
		}
		//���ﲻ���ټ���������
		//System.out.println(i);
		System.out.println("=============================");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		while(j<10){
			System.out.println("ף��Ҷ���ڿ��֣�����Խ��Խ�");
			j++;
		}
		System.out.println(j);
	}
}