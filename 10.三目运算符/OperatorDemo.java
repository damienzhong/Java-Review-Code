/*
	��Ŀ�������!true

	˫Ŀ�������3 + 4
	
	��Ŀ�������
		��ʽ���Ƚϱ��ʽ?���ʽ1:���ʽ2;
		
		�Ƚϱ��ʽ�������һ��boolean���͡�
		
		ִ�����̣�
			���ݱȽϱ��ļ��㷵��һ��true����false
			�����true���Ͱѱ��ʽ1��Ϊ�����
			�����false���Ͱѱ��ʽ2��Ϊ�����
*/
public class OperatorDemo{
	public static void main(String[] args){
		int x = 100;
		int y = 200;
		
		//int z = ((x > y) ? x:y);
		//int z = ((x < y) ? x:y);
		//int z = ((x == y) ? x:y);
		int z = ((x = y) ? x:y);
		
		System.out.println("z:" + z);
	}
}