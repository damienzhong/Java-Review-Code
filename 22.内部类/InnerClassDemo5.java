/*
	�����ڲ��ࣺ
		�����ڲ���ļ�д����
		
	ǰ�᣺����һ������߽ӿ�
		�����������Ǿ������Ҳ�����ǳ����ࡣ
		
	��ʽ��
		new �������߽ӿ���(){
			��д����;
		}
		
	������ʲô�أ�
		��һ���̳��˸������ʵ���˸ýӿڵ�������������
*/
interface Inter{
	public abstract void show();
	public abstract void show2();
}

class Outer{
	public void method(){
		//һ��������ʱ��
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show()2{
				System.out.println("show");
			}
		}.show();
		*/
		//����������ʱ��
		/*new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show");
			}
		}.show();
		new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show");
			}
		}.show2();
		*/
		//����ӿڻ����кܶ���������ͺ��鷳
		//��ô����θĽ��أ�
		Inter i = new Inter(){//��̬
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show");
			}
		};
		i.show();
		i.show2();
	}
}

public class InnerClassDemo5{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}