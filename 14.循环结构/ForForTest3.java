/*
	�����ڿ���̨����žų˷���
	
	��������д���žų˷����չ����ʽ��
	1*1=1
	1*2=2	2*2=4
	1*3=3	2*3=6	3*3=9
	1*4=4	2*4=8	3*4=12	4*4=16
	...
	1*9=9	...						9*9=81
	
	ע�⣺
		'\x' x��ʾ���⣬����д������ת���ַ�
		
		'\t' tab����λ��
		'\r' �س�
		'\n' ����
*/
public class ForForTest3{
	public static void main(String[] args){
		for(int i=0;i<9;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
}