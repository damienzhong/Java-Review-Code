/*
	�̳��й��췽���Ĺ�ϵ��
		A�����������еĹ��췽��Ĭ�϶�����ʸ����пղεĹ��췽��
		B��Ϊʲô�أ�
			��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݣ�
			���ԣ������ʼ��ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
			
		ע�⣺����ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super()	
*/
class Father{
	int age;
	
	public Father(){
		System.out.println("Father���޲ι��췽��");
	}
	
	public Father(int age){
		System.out.println("Father���вι��췽��");
	}
}

class Son extends Father{
	public Son(){
		//super();
		System.out.println("Son���޲ι��췽��");
	}
	
	public Son(int age){
		//super();
		System.out.println("Son���вι��췽��");
	}
}

public class ExtendsDemo6{
	public static void main(String[] args){
		Son s = new Son();
		System.out.println("--------------------------------");
		Son s1 = new Son(20);
	}
}