/**
	����Ԫ�����򣨾��ǰ�Ԫ�ضԵ���
	
	˼·������
		��0������arr.length-1�����ݽ���
		��1������arr.length-2�����ݽ���
		...
		ֻҪ����arr.length/2��ʱ�򼴿�
*/
public class ArrayTest03{
	public static void main(String[] args){
		//��һ������
		int[] arr = {22,13,85,11,56,55,33,66};
		//����ǰ
		printArray(arr);
		System.out.println("---------------");
		//����
		reverse(arr);
		//�����
		printArray(arr);
	}
	
	//��������
	public static void reverse(int[] arr){
		/*//��һ�ν���
		int temp = arr[0];
		arr[0] = arr[arr.length-1-0];
		arr[arr.length-1] = temp;
		
		//�ڶ��ν���
		int temp = arr[1];
		arr[1] = arr[arr.length-1-1];
		arr[arr.length-2] = temp;
		
		//�����ν���
		int temp = arr[2];
		arr[2] = arr[arr.length-1-2];
		arr[arr.length-3] = temp;
		*/
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	
	//��������
	public static void printArray(int[] arr){
		System.out.print("[");		
		for(int i = 0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+", ");
			}
			
		}
	}
}