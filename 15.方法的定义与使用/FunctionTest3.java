/*
	����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
*/
import java.util.Scanner;
public class FunctionTest3{
	public static void main(String[] args){
		//��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������n��ֵ��1~9��:");
		int n = sc.nextInt();
		while(n<1||n>9){
			System.out.print("����������ݲ�����Ч��Χ�ڣ����������룺");
			n = sc.nextInt();
		}
		//����
		printNN(n);
	}
	
	/*
		������ȷ��
			����ֵ���ͣ�void
			�����б�int n
	*/
	public static void printNN(int n){
		for(int x=1;x<=n;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}
/*
	����¼����������n��m��Ȼ���÷������n��m�е�����
*/