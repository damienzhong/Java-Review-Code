public class ArrayTool{
	//�ѹ��췽��˽�У����Ͳ����ٴ���������
	private ArrayTool(){}
	
	public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}
	
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