/**
	�������������������������е�ÿһ��Ԫ��
	
	ע�⣺�����ṩ��һ������length�����ڻ�ȡ����ĳ���
		��ʽ:������.length
*/
public class ArrayTest{
	public static void main(String[] args){
		//��������
		int[] arr = {11,22,33,44,55};
		
		//��ȡÿһ��Ԫ��
		//��λ�ȡ������֪�������������(����)�Ϳ����ҵ�����
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("----------------------");
		//��Ȼ�����������ԣ����ǲ���������Ҫ��
		//�����ظ��ȸ�
		//�����䡢������������ͬ�ģ������������ı仯
		for(int i = 0;i<5;i++){
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,5,2,1,5,4};
		
		System.out.println(arr.length);
		System.out.println(arr2.length);
		System.out.println("----------------------");
		//�Ľ�
		for(int i = 0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("----------------------");
		printArray2(arr);
		System.out.println();
		System.out.println("----------------------");
		printArray2(arr2);
	}
	
	/**
		��������ķ���
		������ȷ:
			����ֵ���ͣ�void
			�����б�int[] arr
	*/
	public static void printArray(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	//�Ľ���
	public static void printArray2(int[] arr){
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