/*
	final���α����ĳ�ʼ��ʱ��
		A:��final���εı���ֻ�ܸ�ֵһ�Ρ�
		B:�ڹ��췽�����ǰ���Ǿ�̬������
*/
class Demo{
	int num = 10;
	final int num2;
	//final int num2 = 20;
	
	{
		num2 = 10;
	}
	public Demo(){
		num = 100;
		num2 = 200;
	}
}

public class FinalTest2{
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.num);
		System.out.println(d.num2);
	}
}