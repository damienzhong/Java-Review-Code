/**
*	���鳣�ò���������
*	@author ������
*	@version v1.0
*/
public class ArrayTool{
	//�ѹ��췽��˽�У����Ͳ����ٴ���������
	private ArrayTool(){}
	
	/**
	*	��������
	*	@param arr
	*/
	public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}
	
	/**
	*	��ȡָ����ֵ������
	*	@param arr,value
	*	@return int
	*/
	public static int getIndex(int[] arr,int value){
		int index = -1;
		
		for(int x=0;x<arr.length;x++){
			if(arr[x]==value){
				index = x;
				break;
			}
		}
		return index;
	}
	
	/**
	*	��ȡ�����е����ֵ
	*	@param arr
	*	@return int
	*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max = arr[x];
			}
		}
		return max;
	}
}