/**
	��Ҫ��������в���
	
	��ͬһ���ļ����£��ඨ���������ļ��кͶ�����һ���ļ�����ʵһ���ġ�
*/
public class ArrayDemo{
	public static void main(String[] args){
		//����һ������
		int[] arr = {18,23,6,55,21};
		
		//��������
		/*for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}*/
		//������ж�����鶼Ҫ���б�������ô��������ظ����ͺܸ�
		//��θĽ����÷����Ľ�
		//printArray(arr);
		
		//����������ã�����������Ķ��󣬵���������Ĺ���
		//���������ڵĲ����Ǹ�������صģ����У�Ӧ�ð���Щ�������嵽����������С�
		//����һ������Ĳ�����
		//ArrayTool t = new ArrayTool();
		//t.printArray(arr);
		
		//�����Ľ�Ϊ��̬�󣬾Ϳ���ֱ��ͨ����������
		ArrayTool.printArray(arr);
		System.out.println();
		
		//��ȡ55������ֵ
		int index = ArrayTool.getIndex(arr,55);
		System.out.println(index);
		
		//��ȡ�������ֵ
		int max = ArrayTool.getMax(arr);
		System.out.println(max);
	}
	
	/*public static void printArray(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x==arr.length){
				System.out.println(arr[x]);
			}else{
				System.out.print(arr[x]+",");
			}
		}
	}*/
}