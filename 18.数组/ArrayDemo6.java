/**
	�����������������С���⣺
		ArrayIndexOutOfBoundsException:�����������±�Խ���쳣��
		ԭ��:������˲����ڵ�����
		
		NullPointerException:��ָ���쳣
		ԭ�������Ѿ�����ָ����ڴ��ˣ����㻹��������ȥ����Ԫ��
*/
public class ArrayDemo6{
	public static void main(String[] args){
		//��������
		int[] arr = {1,2,3};
		//System.out.println(arr[3]);
		
		//�������͵ĳ������ճ���null
		arr = null;
		System.out.println(arr[0]);
	}
}