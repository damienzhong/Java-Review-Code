/**
	�Ѵ���װ������	
	
	������̣���������Щ�أ�A���򿪱���	B��װ������	C���رձ�����
	
	
*/
public class Demo{
	public static void main(String[] args){
		/*System.out.println("�򿪱���");
		System.out.println("װ������");
		System.out.println("�رձ�����");
		*/
		open();
		in();
		close();
	}
	
	public static void open(){
		System.out.println("�򿪱���");
	}
	
	public static void in(){
		System.out.println("װ������");
	}
	
	public static void close(){
		System.out.println("�رձ�����");
	}
}

/**
	�������
		������ô���ܸ�������������˼�룿
			A������Щ�ࣿ
			B��ÿ��������Щ������
			C��������֮��Ĺ�ϵ��ʲô��
			
	�Ѵ���װ������ķ���������η�������Щ�ࣿUML��������ȡ����
	
		A������Щ�ࣿ
			����
			����
			Demo
		B��ÿ��������Щ������
			����
				��ȥ
			���䣺
				����
				����
			Demo��
				main����
		C��������֮��Ĺ�ϵ��ʲô��
			Demo��ʹ�ô���ͱ�����Ĺ���
		
			
		class ����{
			public static void in(){
				System.out.println("װ������");
			}
		}
		
		class ����{
			public static void in(){
				System.out.println("װ������");
			}
	
			public static void close(){
				System.out.println("�رձ�����");
			}
		}
			
		class Demo{
			public static void main(String[] args){
				������ÿ���
				������ý�ȥ
				������ù���
			}
		}
			
			
			
*/




