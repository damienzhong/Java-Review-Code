/*
	��Ŀ���ڿ���̨������µ���״
			*****
			*****
			*****
			*****
			
		 void���ͷ���ֵ�ķ������ã�
			��������(����)
			�������(����)
			��ֵ����(����)
*/
public class FunctionDemo3{
	public static void main(String[] args){
		//forѭ��Ƕ�����ͼ��
		for(int x = 0;x<4;x++){
			for(int y=0;y<5;y++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		//��������
		for(int x = 0;x<6;x++){
			for(int y=0;y<7;y++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		//��������
		printStars(3,4);
		//�������
		//System.out.println(printStars(3,4));
		//void v = printStars(3,4);
	}
	
	/*
		дһ��ʲô���ӵķ�����дһ��m��n�еĴ���
		
		������ȷ��
			����ֵ���ͣ����ʱ��û����ȷ�ķ���ֵ����д���������С����ԣ�����ѡ����void
			�����б�int m,int n
	*/
	public static void printStars(int m,int n){
		for(int x = 0;x<m;x++){
			for(int y=0;y<n;y++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}