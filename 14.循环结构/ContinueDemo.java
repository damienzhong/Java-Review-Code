/*
	continue:����
	continue��ʹ�ó�����
		ѭ���У��뿪�˳���û�����塣
	���ԣ��Ա�break��continue������
	break:��������ѭ��
	continue����������ѭ����������һ�ε�ִ��
*/
public class ContinueDemo{
	public static void main(String[] args){
		for(int x=0;x<10;x++){
			if(x==3){
				//break;
				continue;
			}
			System.out.println(x);
		}
		System.out.println("-------------------------");
		
		for(int i =1;i<=10;i++){
			if(i%3==0){
				//�ڴ˴���д����
				//�ڿ���̨���2��
				//break;
				//�ڿ���̨���7��
				//continue;
				//�ڿ���̨���13��
				System.out.println("DM���������Ǵ����ӵ��Ա���װ�꣬ϣ����Ҷ��֧��");
			}
			System.out.println("DM���������Ǵ����ӵ��Ա���װ�꣬ϣ����Ҷ��֧��");
		}
		
	}
}