/**
	��ά������ʵ����һ��Ԫ��Ϊһά��������顣
	
	��ʽ1��
		��������[][] ������ = new ��������[m][n];
		m:��ʾ�����λ�����ֶ��ٸ�һά����
		n:��ʾÿһ��һά�����Ԫ���ж��ٸ�
		
	ע�⣺
		A�����¸�ʽҲ���Ա�ʾ��ά����
			�������� ������[][] = new ��������[m][n];
			��������[] ������[] = new ��������[m][n];
		B��ע�����涨��
			int x;
			int y;
			int x,y;
			
			int[] x;
			int[] y[];
			
			int[] x,y[];
*/
public class Array2Demo{
	public static void main(String[] args){
		//����һ����ά����
		int[][] arr = new int[3][2];
		//������һ����ά����arr
		//�����λ������3��һά�����Ԫ��
		//ÿһ��һά������2��Ԫ��
		//�����ά��������
		System.out.println(arr);//��ֵַ  [[I@6d06d69c
		//�����ά����ĵ�һ��Ԫ��һά���������
		System.out.println(arr[0]);//��ֵַ	[I@7852e922
		System.out.println(arr[1]);//��ֵַ	[I@4e25154f
		System.out.println(arr[2]);//��ֵַ	[I@70dea4e
		//�����ά�����Ԫ��
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][1]);//0
	}
}