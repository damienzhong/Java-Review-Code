/*
	��Ŀ����ȡ���������е����ֵ
	������Ҫ��Ϊ�˽���if����ǿ���Ƕ��ʹ�õģ������ǿ�������Ƕ��
	
*/
public class IfTest3{
	public static void main(String[] args){
		int a = 10;
		int b = 30;
		int c = 20;
		
		//��Ԫ����ʵ��
		//int temp = (a > b)?a:b;
		//int max = (temp > c)?temp:c;
		//System.out.println("max:"+max);
		//System.out.println("==================");
		//��ifʵ��
		int max;
		if(a>b){
			if(a>c){
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b>c){
				max = b;
			}else {
				max = c;
			}
		}
		System.out.println("max:"+max);
	}
}