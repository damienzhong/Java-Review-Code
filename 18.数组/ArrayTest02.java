/**
	��ȡ�����е���ֵ�����ֵ����Сֵ��
*/
public class ArrayTest02{
	public static void main(String[] args){
		//����һ������
		int[] arr = {8,3,9,7,5,10,33};
		int max = getMax(arr);
		System.out.println(max);
		System.out.println("--------------------");
		int min = getMin(arr);
		System.out.println(min);
	}
	
	//��ȡ�����е����ֵ
	public static int getMax(int[] arr){
		//��ȡ�����е����ֵ
		int max = arr[0];
		//��������Ԫ��
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		//�����������汣��ľ������ֵ
		return max;
		//System.out.println(max);
	}
	
	//��ȡ�����е���Сֵ
	public static int getMin(int[] arr){
		//��ʼ����Сֵ
		int min = arr[0];
		//����Ԫ��
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
}