/**
	��������[][] ������ = new ��������[][]{{Ԫ��1},{Ԫ��2},{Ԫ��3}....};
	
	�򻯰汾��
		��������[][] ������ = {{Ԫ��1},{Ԫ��2},{Ԫ��3}....};
		
	������
		int[][] arr = {{1,2,3},{4,5},{6}};
*/
public class Array2Demo3{
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5},{6}};
		
		System.out.println(arr);//��ֵַ
		System.out.println(arr[0]);//��ֵַ
		System.out.println(arr[1]);//��ֵַ
		System.out.println(arr[2]);//��ֵַ
		
		System.out.println(arr[0][0]);//1
		System.out.println(arr[1][0]);//4
		System.out.println(arr[2][0]);//6
		
		System.out.println(arr[0][1]);//2
		System.out.println(arr[1][1]);//5
		
		System.out.println(arr[2][1]);//���������±�Խ��
	}
}