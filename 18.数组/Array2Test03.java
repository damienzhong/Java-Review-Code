/**
	���󣺴�ӡ���������(�������Լ���¼��)
	
	1
	1 1	
	1 2 1
	1 3 3 1
	1 4 6 4 1 
	1 5 10 10 5 1
	
	��������ͼ��Ĺ���
		A���κ�һ�еĵ�һ�к����һ�ж���1
		B���ӵ����п�ʼ��ÿһ������������һ�е�ǰһ�к�����һ�еı���֮��

	���裺
		A�����ȶ���һ����ά���顣���������n,���ǰ�����Ҳ����Ϊn��
			���n�����������ڼ���¼��
		B���������ά�����κ�һ�еĵ�һ�к����һ�и�ֵΪ1
		C�����չ��ɸ�����Ԫ�ظ�ֵ
			�ӵ����п�ʼ��ÿһ������������һ�е�ǰһ�к�����һ�еı���֮��
		C�����������ά����
*/
import java.util.Scanner;
public class Array2Test03{
	public static void main(String[] args){
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//���n�����������ڼ���¼��
		System.out.println("������һ�����ݣ�");
		int n = sc.nextInt();
		
		//����һ����ά����
		int[][] arr = new int[n][n];
		
		//�������ά�����κ�һ�еĵ�һ�к����һ�и�ֵΪ1
		for(int x = 0;x<arr.length;x++){
			arr[x][0] = 1;//�κ�һ�еĵ�һ��
			arr[x][x] = 1;//�κ�һ�е����һ��
		}

		//�ӵ����п�ʼ��ÿһ������������һ�е�ǰһ�к�����һ�еı���֮��
		for(int x=2;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y] = arr[x-1][y-1]+arr[x-1][y];
			}
		}
		
		//������ά����
		/*for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}*/
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}