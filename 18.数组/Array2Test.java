/**
	���󣺶�ά����ı���
	
	��ѭ�����Ƶ��Ƕ�ά����ĳ��ȣ���ʵ����һά����ĸ���
	��ѭ�����Ƶ���һά����ĳ���
*/
public class Array2Test{
	public static void main(String[] args){
		//����һ����ά����
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		//˭����{1,2,3}
		//arr[0]���ǵ�һ������
		//arr[0] = {1,2,3};
		for(int x=0;x<arr[0].length;x++){
			System.out.println(arr[0][x]);
		}
		System.out.println("-------------------");
		for(int x=0;x<arr[1].length;x++){
			System.out.println(arr[1][x]);
		}
		System.out.println("-------------------");
		for(int x=0;x<arr[2].length;x++){
			System.out.println(arr[2][x]);
		}
		System.out.println("-------------------");
		
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.println(arr[x][y]);
			}
		}
		System.out.println("-------------------");
		printArray2(arr);
	}
	
	public static void printArray2(int[][] arr){
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.print(arr[x][y]);
			}
			System.out.println();
		}
	}
}