/**
	����Ԫ�ز��ң�����ָ��Ԫ�ص�һ���������г��ֵ�������
*/
public class ArrayTest04{
	public static void main(String[] args){
		//��������
		int[] arr = {20,18,88,53,27,56,44,33};
		
		int index = getIndex(arr,100);
		System.out.println(index);
		System.out.println("-------------");
		int index2 = getIndex2(arr,100);
		System.out.println(index2);
	}
	
	//����ָ��Ԫ�ص�һ���������г��ֵ�����
	public static int getIndex(int[] arr,int value){
		//�������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				//�����ȣ��ͷ��ص�ǰ������ֵ
				return i;
			}
		}
		//����Ҳ������ݣ�����һ�㷵��һ�����ݽ��б�ʶʧ�ܣ�һ�����ø���
		return -1;
	}
	
	public static int getIndex2(int[] arr,int value){
		//����һ������
		int index = -1;
		
		//�о��޸�����ֵ
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				//�����ȣ��ͷ��ص�ǰ������ֵ
				index = i;
				break;
			}
		}
		
		return index;
	}
}