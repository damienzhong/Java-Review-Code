/*
	����飺��Java�У�ʹ��{}�������Ĵ��뱻��Ϊ�����
	������λ�ú������Ĳ�ͬ�����Է�Ϊ��
		�ֲ�����飺�ֲ�λ�ã������޶��������������ڣ���˳��ִ��
		�������飺�����еĳ�Աλ�ã���{}�������Ĵ��룬ÿ�ε��ù��췽������ִ��һ�Σ�������ִ�й�������
			���ã����԰Ѷ�����췽���еĹ�ͬ����ŵ�һ�𣬶Զ�����г�ʼ��
		��̬����飺�����еĳ�Աλ�ã���{}�������Ĵ��룬ֻ��������static�����ˣ�ִֻ��һ��
			���ã�һ���Ƕ�����г�ʼ��
	
	�����⣺
		��̬����飬�������飬���췽����ִ��˳��
		��̬�����  --  ��������  --  ���췽��

*/
class Code{
	static {
			int x = 2000;
			System.out.println(x);
	}
	
	//��������
	{
		int x = 100;
		System.out.println(x);
	}
	
	//���췽��
	public Code(){
		System.out.println("code");
	}
	
	//��������
	{
		int x = 200;
		System.out.println(x);
	}
}

public class CodeDemo{
	public static void main(String[] argss){
		
		//�ֲ������
		{
			int x = 10;
			System.out.println(x);
		}
		// �Ҳ�������
		//System.out.println(x);
		{
			int x = 1000;
			System.out.println(x);
		}
		
		Code c = new Code();
		System.out.println("------------");
		Code c2 = new Code();
		System.out.println("------------");
	}
}