/**
	��������[][] ������ = new ��������[m][];
	
	m��ʾ�����ά�����ж��ٸ�һά����
	��һ��û��ֱ�Ӹ���һά�����Ԫ�ظ���������Ϊ�������ǿ��Զ�̬����
	
*/
public class Array2Demo2{
	public static void main(String[] args){
		//��������
		int[][] arr = new int[3][];
		
		System.out.println(arr);//[[I@6d06d69c
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		System.out.println("-------------------------");//null
		//��̬��Ϊÿһ��һά�������ռ�
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		System.out.println(arr[0]);//[I@7852e922
		System.out.println(arr[1]);//[I@4e25154f
		System.out.println(arr[2]);//[I@70dea4e
		
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][1]);//0
		//ArrayIndexOutOfBoundsException
		//System.out.println(arr[0][2]);
		
		arr[1][0] = 100;
		arr[1][2] = 200;
		
		System.out.println(arr[1][0]);//0
		System.out.println(arr[1][2]);//0
	}
}