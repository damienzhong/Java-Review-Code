/*
	return ����
		��ʵ��������������ѭ���ģ�����������������
*/
public class ReturnDemo{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i==2){
				System.out.println("�˳�");
				//break;
				//continue;
				return;
			}
			System.out.println(i);
		}
		System.out.println("over");
	}
}