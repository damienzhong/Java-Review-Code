/*
	����
		A:��1-100֮�͡�

		B:���1-100֮��ż����

		C:���1-100֮��������(�����Լ���)
*/
public class ForDemo4{
	public static void main(String[] args){
		//��1-100֮��
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		System.out.println("==============");
		//���1-100֮��ż����
		//��ʽһ
		int sum2 = 0;
		for(int i=1;i<=100;i++){
			if(i%2 == 0){
				sum2 += i;
			}
		}
		System.out.println(sum2);
		System.out.println("==============");
		//��ʽ��
		int sum3 = 0;
		for(int i=0;i<=100;i+=2){
			sum3 += i;
		}
		System.out.println(sum3);
	}
}